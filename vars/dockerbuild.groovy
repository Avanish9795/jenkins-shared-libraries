def call(String image, String tag) {
    sh "/usr/bin/docker build -t avanish9795/${image}:${tag} ."
}
