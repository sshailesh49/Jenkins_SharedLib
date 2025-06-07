

def call(){
   sh 'sed -i 's/\("serviceName": "app-v2", "servicePort": 80, "weight": \)[0-9]\+/\110/' ingress-canary.yaml'
 // sh "sed -i 's/\\(\"serviceName\": ${appName}, \"servicePort\": 80, \"weight\": \\)[0-9]\\+/\\1${newWeight}/' ${filePath}"

}

