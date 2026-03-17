def call(String creds, String image, String tag) {
    withCredentials([usernamePassword(credentialsId: creds, usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh """
        echo \$PASS | /usr/bin/docker login -u \$USER --password-stdin
        /usr/bin/docker push avanish9795/${image}:${tag}
        """
    }
}
