def call(String image, String tag) {
    sh """
    echo "PATH=$PATH"
    which docker
    docker --version
    docker build -t avanish9795/${image}:${tag} .
    """
}
