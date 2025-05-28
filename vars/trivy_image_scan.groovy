call(){   
       sh '''
          trivy image --format json \
                --output trivyimage.json \
                --severity HIGH,CRITICAL \
                --ignore-unfixed \
                $REPO_IMAGE_LATEST
            '''
}
