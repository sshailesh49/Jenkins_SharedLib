def call(){
  //sh "trivy fs ."

  
  trivy fs --scanners vuln,secret,config \
                             --severity CRITICAL,HIGH,MEDIUM,LOW \
                             --format table \
                            --output trivy-fs-report.txt \

}
