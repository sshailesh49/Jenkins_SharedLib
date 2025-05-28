call(String IMAGE_NAME, String REPO_IMAGE ){
    sh """
       docker rmi $IMAGE_NAME || true
       docker rmi $REPO_IMAGE || true
       docker images
     """
}
