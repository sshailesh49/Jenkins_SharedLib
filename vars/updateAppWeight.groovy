

def call(){
    sh "git --version"
    sh "pwd"
    sh "sed -i 's/\("serviceName": "app-v2", "servicePort": 80, "weight": \)[0-9]\+/\1100/' ingress-canary.yaml"

}

