withCredentials([usernamePassword(
    credentialsId: 'dockerHubCreds',
    usernameVariable: 'USER',
    passwordVariable: 'PASS'
)]) {
    sh """
    echo $PASS | docker login -u $USER --password-stdin
    docker push avanish9795/${image}:${tag}
    """
}
