
def buildImage() {
    echo "building the docker image..."
    sh "ls"
    sh "ls target/"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t faigh/petspring:1.0.0 ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push faigh/petspring:1.0.0"
    }
}
def test() {

    echo "Testing"
    sh "mvn test"

}
def buildJar() {
    echo "building the JAR."
    sh "mvn clean package"
   
}



return this
