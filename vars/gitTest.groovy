def call(Map config){
     
   
    stage("tests"){
        sh "./gradlew test"      
    }
    
    
}
