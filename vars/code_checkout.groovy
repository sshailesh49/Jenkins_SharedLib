def call(String GitUrl, String GitBranch){
  git branch: '${GitBranch}', credentialsId: 'git-token', url: '${GitUrl}'
}
