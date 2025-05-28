//def call(){
//  timeout(time: 1, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
//  }
//}

def call(String SonarToken){
      waitForQualityGate abortPipeline: false, credentialsId: ${SonarToken}
}
