
 def call(Map config){
     
    stage("complilation"){
        
        sh "./gradlew run" 
    }
    stage("tests"){
        sh "./gradlew test"      
    }
     stage ("Reports"){
        jacoco exclusionPattern: '**/*Test*.class', inclusionPattern: '**/*.class', sourceExclusionPattern: '/**/*.java'
         pmd canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '**/pmd.xml.', unHealthy: ''
          
     
        
        } 
    
}
