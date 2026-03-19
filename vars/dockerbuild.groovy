def call(String image, String tag) {
    sh """
    echo "PATH=\$PATH"
    which docker
    docker --version
    docker build -t mishraavanish9795/${image}:${tag} .
    """
}

return this
