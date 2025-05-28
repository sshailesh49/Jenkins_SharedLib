def call(String IMAGE_NAME){   
       sh '''
          trivy image --format json \
                --output trivyimage.json \
                --severity HIGH,CRITICAL \
                --ignore-unfixed \
                $IMAGE_NAME
            '''
}
