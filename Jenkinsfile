pipeline {
  agent {
    docker {
      image 'maven:3.8.6'
    }
  }

  stages {
    stage('Lint') {
      steps {
        sh 'mvn clean lint'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean compile'
      }
    }

    stage('Unit Tests') {
      steps {
        sh 'mvn clean test'
      }

      post {
        always {
          junit '**/target/surefire-reports/*.xml'
          cobertura coberturaReportFile: '**/target/site/cobertura/coverage.xml'
        }
      }
    }
  }
}
