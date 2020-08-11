@Library('shared-library@master')_

pipeline {
    agent any
     tools {
             gradle 'gradle'
           
           }
    stages{
    
       stage("Git Checkout"){
               steps{
                   Checkout()
            
                }
           }
        
        
     stage('Version') {
            steps{
                script{
                 
                     def versionId = sh (
                     script: "cat build.gradle  | grep version ",
                     returnStdout: true).trim()
                     println("versionId:${versionId}")
                     
                    // echo "currentBuild.displayName = ${versionId}-${currentBuild.number}" ; 
                 
                }  
                  
            }
        }
                     
                     
        stage("Build"){
               steps{
            
                   gitBuild()
            
                }
            }
        
        stage ("Reports"){
                steps{
      
                    gitReports() 
            
               }
            }
        
        
        stage("Deploy") {
             steps{
    
                gitDeployment()
            }
        }
    }
    
}


