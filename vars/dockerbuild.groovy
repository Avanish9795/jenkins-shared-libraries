def call(String image, String tag) {
    sh "docker build -t avanish9795/${image}:${tag} ."
}
