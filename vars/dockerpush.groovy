withCredentials([usernamePassword(
    credentialsId: 'dockerhub',
    usernameVariable: 'USER',
    passwordVariable: 'PASS'
)]) {
    sh "docker login -u $USER -p $PASS"
    sh "docker tag notes-app:latest yourdockerhub/notes-app:latest"
    sh "docker push yourdockerhub/notes-app:latest"
}
