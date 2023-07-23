def call() {
    sh "mvn clean package -skipUnitTests"
}