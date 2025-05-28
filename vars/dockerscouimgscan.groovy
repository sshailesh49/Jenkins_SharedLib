call(){

              sh """
                        echo " Running full docker-scout quickview scan..."
                        export PATH=$HOME/bin:$PATH
                        
                        docker-scout quickview $IMAGE_NAME > scout-full-qv.txt || true
                        docker-scout cves  $IMAGE_NAME > report-cves.txt 
 

               """
}
