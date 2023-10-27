def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'gihubToken', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t mimi360/maven-app-demo:1.2 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push mimi360/maven-app-demo:1.2'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
