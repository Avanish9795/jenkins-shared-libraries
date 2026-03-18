def call(String image, String tag) {
    sh "docker build -t avanish9795/notes-app:latest/${image}:${tag} ."
}
