def call(String ImgName, String ImgTag, String DockerHubUser) {
    sh """
     docker image build -t ${DockerHubUser}/${ImgName} .
     docker image tag  ${DockerHubUser}/${ImgName} ${DockerHubUser}/${ImgName}:${ImgTag}
     docker image tag  ${DockerHubUser}/${ImgName} ${DockerHubUser}/${ImgName}:latest
    """
}