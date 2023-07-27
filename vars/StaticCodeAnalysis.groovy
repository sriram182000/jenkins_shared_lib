def call(sonar) {
    withSonarQubeEnv(credentialsId: 'SonarQubeCredentialsId')
    sh "mvn clean package sonar:sonar"
}