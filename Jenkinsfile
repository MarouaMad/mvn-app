pipeline{
  agent any
  environment{
    NEW_VERSION = "1.3.0"
    SERVER_CREDENTIALS=credentials('githubToken')
  }
  stages{
    stage("build"){
      steps{
         echo "build application ${NEW_VERSION}"
        echo "credentials ${SERVER_CREDENTIALS}"
      } 
      }
    stage("test"){
        steps{
            echo "test application"
        }
    }

    stage("deploy application"){
      input{
        message "Select the environment to deploy"
        ok "Done"
        parameters{
          choice(name:'ENV',choices:['dev','stagging','prod'],description:'')
        }
      }

        steps{
            echo "deploy application to ${{ENV}}"
        }
    }  
   } 
    post{
      success {
          echo "something wrong"
      }
        
    }
}
