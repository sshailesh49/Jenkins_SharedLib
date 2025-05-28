call(){

   sh '''
                        echo " Running full docker-scout quickview scan..."
                        export PATH=$HOME/bin:$PATH
                        

                        # Basic scan
                        docker-scout quickview $IMAGE_NAME > scout-full-qv.txt || true
                        docker-scout cves  $IMAGE_NAME > report-cves.txt 
 

                        # Fixable vulnerabilities only
                        # docker-scout quickview $IMAGE_NAME --only-fixable > scout-fixable.txt

                        # JSON output ,table,sarif,raw   default format  table
                        # docker-scout quickview $IMAGE_NAME --format json > scout-full.json

                        # Output to file using --output
                        # docker-scout quickview $IMAGE_NAME --format table --output scout-full-out.json

                        # Ignore base image issues
                        # docker-scout quickview $IMAGE_NAME --ignore-base > scout-ignore-base.txt

                        # Use custom policy (if you have one, optional)
                        # docker-scout quickview $IMAGE_NAME --policy ./policy.yml > scout-policy.txt

                        # Set exit code if critical issues found (optional fail step)
                        # docker-scout quickview $IMAGE_NAME --exit-code 1 
                        # docker-scout compare  --to  $IMAGE_NAME  $PREVIOUS_IMAGE_NAME > images-comparison.json
                    '''
}
