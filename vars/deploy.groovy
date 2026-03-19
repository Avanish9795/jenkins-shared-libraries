def call() {
    sh """
    docker stop notes-app || true
    docker rm notes-app || true
    docker run -d -p 8000:8000 --name notes-app mishraavanish9795/notes-app:latest
    """
}
