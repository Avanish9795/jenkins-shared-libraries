withCredentials([usernamePassword(
    credentialsId: 'dockerHubCred',
    usernameVariable: 'DOCKER_USER',
    passwordVariable: 'DOCKER_PASS'
)]) {
    sh '''
    echo $PASS | docker login -u $USER --password-stdin
    docker tag notes-app:latest $USER/notes-app:latest
    docker push $USER/notes-app:latest
    '''
}
