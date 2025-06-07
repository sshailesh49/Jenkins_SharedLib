//def updateAppV2Weight(String filePath, int newWeight = 100) {
    // Jenkins Pipeline shell command execute use  sh() 
//    def sedCommand = "sed -i 's/\\(\"serviceName\": \"app-v2\", \"servicePort\": 80, \"weight\": \\)[0-9]\\+/\\1${newWeight}/' ${filePath}"
    
//    echo "Running command: ${sedCommand}"
    
//    sh sedCommand
// }

def call(String fileName ,String appName, int newWeight){
  // sh 'sed -i 's/\("serviceName": "app-v2", "servicePort": 80, "weight": \)[0-9]\+/\1100/' ingress-canary.yaml'
  sh "sed -i 's/\\(\"serviceName\": ${appName}, \"servicePort\": 80, \"weight\": \\)[0-9]\\+/\\1${newWeight}/' ${filePath}"

}

