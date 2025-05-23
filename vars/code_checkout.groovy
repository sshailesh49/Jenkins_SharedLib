def call(String GitUrl, String GitBranch, String GitToken){
  git branch: "${GitBranch}", url: "${GitUrl}", credentialsId: "${GitToken}"
}
