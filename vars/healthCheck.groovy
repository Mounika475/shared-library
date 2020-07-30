//def call(Map config) {
    //node {
   //   checkout([
//$class: 'GitSCM',
//branches: [[name: stageParams.branch ]],
//userRemoteConfigs: [[ url: stageParams.url]]
//sh 'mvn package'
//])
        //git url: "https://github.com/jenkinsci/${config.name}-plugin.git"
 def call(Map config){
    stage("complilation"){
        sh "mvn package" 
        
        //mail to: '...', subject: "${config.name} plugin build", body: '...'
    }
}
