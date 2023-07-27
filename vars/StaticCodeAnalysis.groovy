def call(sonar) {
    withSonarQubeEnv(credentialsId: 'sonar')
    sh "mvn clean package sonar:sonar"
}