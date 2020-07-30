
 def call(Map config){
     
    stage("complilation"){
        
        sh "./gradlew run" 
    }
    //stage("tests"){
      //  sh "./gradlew test"      
        
      
    //}
}
