def call(Map config){    
    
        jacoco exclusionPattern: '**/*Test*.class', inclusionPattern: '**/*.class', sourceExclusionPattern: '/**/*.java'
         pmd canComputeNew: false, defaultEncoding: '', healthy: '', pattern: '**/pmd.xml.', unHealthy: ''
          
     
     
    
}

