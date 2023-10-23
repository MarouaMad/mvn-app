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
        steps{
            echo "delpoy application"
        }
    }  
   } 
    post{
      success {
          echo "something wrong"
      }
        
    }
}
