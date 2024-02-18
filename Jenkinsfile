@Library('my-shared-library-demo') _

      pipeline {
          agent any

      stages {
          stage('Hello') {
            steps {
              welcome("devops class")
          }
      }
      
      stage('calculation'){
          steps{
              
              script{
                  
                  calculator.add(25,75)
                  calculator.mul(25,75)
              }
          }
          
      }
  }
 
}

