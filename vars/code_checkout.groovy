def call(String GitUrl, String GitBranch, string GitToken){
  git branch: "${GitBranch}", url: "${GitUrl}", credentialsId: "${GitToken}"
}
