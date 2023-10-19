pipeline {
    agent any
    tools {
        maven 'mvn'
    }
    stages {
        stage('Build') {
            steps {
                script {
                    git 'https://github.com/victorvlle/av2_jenkins.git'
                    sh "mvn -Dmaven.test.failure.ignore=true clean package"
                }
            }
        }
        
        stage('Lint do Código Fonte'){
            steps{
                sh 'mvn -f https://raw.githubusercontent.com/victorvlle/av2_jenkins/main/pom.xml checkstyle:checkstyle'
            }
        }
        
        stage('Cobertura de Código'){
            steps{
                sh 'mvn clean test jacoco:report'
            }
        }
        
        stage('Testes Unitários'){
            steps{
                sh 'mvn test'
            }
            post{
                always{
                    junit '**/target/test-reports/*.xml'
                }
            }
        }
    }
}
