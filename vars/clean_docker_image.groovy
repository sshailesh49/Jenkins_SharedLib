call(string IMAGE_NAME, string REPO_IMAGE ){
    sh """
       docker rmi $IMAGE_NAME || true
       docker rmi $REPO_IMAGE || true
       #docker rmi $REPO_IMAGE_LATEST || true
       docker images
     """
}
