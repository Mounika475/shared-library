
 def call(Map config){
     
    stage("complilation"){
        
        sh "mvn package" 
        
        
      
    }
}
