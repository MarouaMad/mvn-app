pipeline{
  agent any
  stages{
    stage("build"){
      steps{
         echo "build application"
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
      failure {
          echo "something wrong"
      }
        
    }
}
