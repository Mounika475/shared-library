
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
 
    sh "curl -v -u tomcat:tomcat -T /root/.jenkins/workspace/shared1/target/spring3-mvc-maven-xml-hello-world-3.0-SNAPSHOT.war
 'http://ec2-18-188-40-43.us-east-2.compute.amazonaws.com:8080//manager/text/deploy?path=/gradle1'"
   }
    
}
