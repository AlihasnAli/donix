pipeline {
    agent {
        label 'master'
    }
    stages {
        stage('Build Stage') {
            steps {
                sh './gradlew clean build'
            }
        }
    }
}