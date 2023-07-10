def call(string ImgName, string ImgTag, string DockerHubUser) {
    sh """
     docker image build -t ${DockerHubUser}/${ImgName} .
     docker image tag  ${DockerHubUser}/${ImgName} ${DockerHubUser}/${ImgName}:${ImgTag}
     docker image tag  ${DockerHubUser}/${ImgName} ${DockerHubUser}/${ImgName}:latest
     """
}