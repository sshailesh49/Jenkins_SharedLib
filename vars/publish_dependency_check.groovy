def call(){
    dependencyCheckPublisher(
                     pattern: 'dependency-check-report.xml',
                     failedTotalCritical: 0,
                     failedTotalHigh: 4,
                     failedTotalMedium: 10,
                     failedTotalLow: 0,
                     unstableTotalCritical: 0,
                     unstableTotalHigh: 4,
                     unstableTotalMedium: 10,
                     unstableTotalLow: 0,
                     stopBuild: true
                 )
}
