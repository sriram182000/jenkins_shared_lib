def call(SonarQubeCredentialsId) {
	waitForQualityGate abortPipeline: false, credentialsId: SonarQubeCredentialsId
}