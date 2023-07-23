def call() {
    sh "mvn clean package -DskipUnitTests"
}