pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo 'Fazendo o projeto'
            }
        }
        stage('Unit Tests') {
            steps {
                echo 'Fazendo teste'
            }
        }
        stage('Deploy to Stage') {
            steps {
                echo 'Fazer deploy em ambiente de homologação'
            }
        }
        stage('Acceptance Tests') {
            steps {
                echo 'Fazer deploy em ambiente de homolocação'
            }
        }
    }
}

