pipeline{
  agent any
  stages{
    stage("build"){
      steps{
         echo "build application"
      } 
      }
    stage("test"){
      when {
        expression{
          BRANCH_NAME="dev"
        }
      }
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
