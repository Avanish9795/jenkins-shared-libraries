def call(String creds, String image, String tag) {
    withCredentials([usernamePassword(credentialsId: creds, usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh "docker login -u $USER -p $PASS"
        sh "docker push avanish9795/${image}:${tag}"
    }
}
