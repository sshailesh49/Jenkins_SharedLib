def call(){
        sh '''
                  
            export PATH=$HOME/bin:$PATH
            docker-scout version
            docker-scout quickview fs://. > scout-report-fs-qv.txt || true
            docker-scout cves fs://. > scout-report-fs-cves.txt || true
            # docker scout cves fs://. --details --only-severity high --format json --output high_severity_report.json || true

          '''
}
