@Library("pipeline-shared-lib")
pipeline {
    agent any
    stages{
        stage('Build'){
            steps{
                swissknife.printName 'John'
            }         
        }
    }
   
}


