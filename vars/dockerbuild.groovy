def call(String dockerUser, String image, String tag) {
    try {
        sh """
        echo "PATH=\$PATH"
        which docker
        docker --version

        echo "Building Docker image: ${dockerUser}/${image}:${tag}"
        docker build -t ${dockerUser}/${image}:${tag} .
        """
    } catch (Exception e) {
        echo "Docker build failed!"
        throw e
    }
}
