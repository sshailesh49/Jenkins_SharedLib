

def call(){
    sh "git --version"
    sh "pwd"
    sh " sudo sed -i 's/\("serviceName": "app-v2", "servicePort": 80, "weight": \)[0-9]\+/\1100/' ingress-canary.yaml"

}

