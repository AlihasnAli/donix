pipeline {
    agent {
        label 'main'
    }
    stages {
        stage('Build Stage 1') {
            steps {
                sh './gradlew clean build'
            }
        }
    }
}