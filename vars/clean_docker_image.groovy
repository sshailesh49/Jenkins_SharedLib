def call(String IMAGE_NAME, String REPO_IMAGE ){
    sh """
       docker images
       docker rmi $IMAGE_NAME || true
       docker rmi $REPO_IMAGE || true
       # docker rmi $REPO_IMAGE_LATEST || true
       docker image prune -af
       docker images
     """
}
