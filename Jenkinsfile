pipeline {

    agent any

    stages {

        stage('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Execute') {
            steps {
                bat 'java -cp target/classes Calculator'
            }
        }
    }
}