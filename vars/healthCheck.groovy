
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
   stage("deploy"){
       
    sh deploy adapters: [tomcat8(credentialsId: 'tomcat', path: '', url: 'http://18.188.40.43:8080/')], contextPath: 'Gradle1', war: '**/*.war'
   }
    
}
