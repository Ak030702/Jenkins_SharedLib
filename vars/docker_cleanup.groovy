def call(String Project, String ImageTag, String DockerHubUser){
  sh "sudo docker rmi ${DockerHubUser}/${Project}:${ImageTag}"
}
