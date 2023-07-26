def call(String Dockerhub, String Imgname, String Tagname) {
    sh """
    docker service docker start
    docker image build -t ${Dockerhub}/${Imgname}:${Tagname} .
    docker image tag ${Dockerhub}/${Imgname} ${Dockerhub}/${Imgname}:${Tagname} 
    docker image tag ${Dockerhub}/${Imgname} ${Dockerhub}/${Imgname}:latest

    """
}