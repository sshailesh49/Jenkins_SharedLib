def call(){
  //sh "trivy fs ."

  
 sh "trivy fs --scanners vuln,secret,config \
                             --severity CRITICAL,HIGH,MEDIUM,LOW \
                             --format table \
                            --output trivy-fs-report.txt \
                               . "

}
