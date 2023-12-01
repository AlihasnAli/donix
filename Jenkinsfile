pipeline {
    agent {
        label 'master'
    }
    stages {
        stage('Build Stage 1') {
            steps {
                sh './gradlew clean build'
            }
        }
    }
}