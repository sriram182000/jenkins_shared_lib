def call(String Dockerhub, String Imgname, String Tagname) {
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    sh "docker login -u $USER -p $PASS"
}
    sh """
        docker image push ${Dockerhub}/${Imgname}:${Tagname}
        docker image push ${Dockerhub}/${Imgname}:latest
}