//def call(){
//  timeout(time: 1, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
//  }
//}

def call(string SonarToken){
      waitForQualityGate abortPipeline: false, credentialsId: ${SonarToken}
}
