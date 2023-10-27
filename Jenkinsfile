pipeline {
    agent any
  tools{
    maven 'maven-3.9'
  }
    stages {
        stage("build jar") {
            steps {
                script {
                    echo "building the application"
                  sh 'mvn package'
                }
            }
        }
      
        stage("build image") {
            steps {
                script {

     echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t mimi360/maven-app-demo:1.1 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push mimi360/maven-app-demo:1.1'
                }
            }
        }
        }
        stage("deploy") {
            steps {
                script {
                    echo "deploying application"
                   
                }
            }
        }
    }   
}
