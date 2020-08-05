def call(Map config){
     
    stage("complilation"){
        
        sh "./gradlew build" 
    }
    
    
}

