def call(){
    //4)
    pipeline {
   agent any
        
    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE    = 'sqlite'
    }

    stages {
        stage('clone') {
            steps {
                echo "Database engine is ${DB_ENGINE}"
                echo "DISABLE_AUTH is ${DISABLE_AUTH}"
               
                sh 'printenv'
            }
        }
    }
}
    
    
    
    //   1)echo ("FOO: ${FOO}")
   //      echo ("FOO:"+env.FOO)
    
    
  
    //2) String myVar = evaluate("myVar")
    
   
    
    //3) println(this.env.FOO)
       //println(env.FOO)



}
