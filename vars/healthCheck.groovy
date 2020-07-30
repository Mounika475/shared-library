
 def call(Map config){
     
    stage("complilation"){
        
        sh "mvn package" 
    }
    stage("tests"){
        sh "mvn test"      
        
      
    }
}
