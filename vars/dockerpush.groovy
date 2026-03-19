// force update
def call(String creds, String image, String tag) {
    withCredentials([usernamePassword(
        credentialsId: creds,
        usernameVariable: 'USER',
        passwordVariable: 'PASS'
    )]) {
        sh """
        echo \$PASS | docker login -u \$USER --password-stdin
        docker push avanish9795/${image}:${tag}
        """
    }
}
