def call(Map config){    
    
     stage ("Reports"){
        jacoco exclusionPattern: '**/*Test*.class', inclusionPattern: '**/*.class', sourceExclusionPattern: '/**/*.java'
         pmd canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '**/pmd.xml.', unHealthy: ''
          
     
     }
    
}

