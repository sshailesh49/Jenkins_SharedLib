def call(){
  
    dependencyCheck additionalArguments: '--scan ./ --format ALL --disableYarnAudit --disableNodeAudit ', odcInstallation: 'DP-Check'
    dependencyCheckPublisher pattern: 'dependency-check-report.xml'

  
}
