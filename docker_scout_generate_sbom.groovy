       call(string IMAGE_NAME ){
           // sh " docker-scout sbom $IMAGE_NAME > sbom.json "
          sh '''
                export PATH=$HOME/bin:$PATH
                docker-scout sbom $IMAGE_NAME \
                --format json \
                --output docker-sbom.json
                echo " SBOM saved docker-sbom.json"
           '''
       }
