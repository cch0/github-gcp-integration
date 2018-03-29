node {
     
    checkout scm

    commit_id = sh(script: 'git rev-parse --verify HEAD', returnStdout: true).trim()
    echo "COMMIT_ID = " + commit_id

    stage('Gradle Build') {
        build()
    }


}

def build() {
    sh "ls -l"
    //sh "rm -rf target"
    sh "./gradlew bootJar"
}
