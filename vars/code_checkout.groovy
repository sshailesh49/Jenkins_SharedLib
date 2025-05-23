def call(String GitUrl, String GitBranch){
  git branch: "${GitBranch}", url: "${GitUrl}"
}
