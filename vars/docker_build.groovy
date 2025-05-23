// Define function
//def call(String ProjectName, String ImageTag, String DockerHubUser){
  // sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."

def call(){
  
    sh 'docker info'
    sh "docker build --build-arg TMDB_V3_API_KEY=c0da2c6d1a96a38fffd098abd2fad815 -t $IMAGE_NAME ."
    sh "docker tag $IMAGE_NAME $REPO_IMAGE"
     sh "docker push $REPO_IMAGE"


  
}
