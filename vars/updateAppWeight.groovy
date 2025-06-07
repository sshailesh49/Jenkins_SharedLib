

def call(){
     sh """
       
    
       // sed -i 's/\\("serviceName": \\"app-v2\\", \\"servicePort\\": 80, \\"weight\\": \\)[0-9]\\+/\\166/'  ingress-canary.yaml

        sed -i "s|\"weight\": [0-9]\+|\"weight\": 55}|g" ingress-canary.yaml



        """

}

