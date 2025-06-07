

def call(){
     sh """
        sed -i 's/\("serviceName": "app-v2", "servicePort": 80, "weight": \)[0-9]\+/\155/' ingress-canary.yaml
        """

}

