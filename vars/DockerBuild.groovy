def call(string Dockerhub, string Imgname, string Tagname) {
    sh """
    docker image build -t ${Dockerhub}/${Imgname}:${Tagname} .
    docker image tag ${Dockerhub}/${Imgname} ${Dockerhub}/${Imgname}:${Tagname} 
    docker image tag ${Dockerhub}/${Imgname} ${Dockerhub}/${Imgname}:latest

    """
}