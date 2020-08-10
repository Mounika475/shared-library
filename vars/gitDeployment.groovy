def call(Map config){
     
sh "curl -v -u tomcat:tomcat -T /root/.jenkins/workspace/shared1/target/spring3-mvc-maven-xml-hello-world-3.0-SNAPSHOT.war 'http://ec2-18-222-145-151.us-east-2.compute.amazonaws.com:8080//manager/text/deploy?path=/gradle1'"
   
    
}

