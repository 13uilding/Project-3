pipeline {
  agent any
  stages {
    stage('Build DataService') {
      environment {
        SPRING_PROFILES_ACTIVE = 'local'
      }
      steps {
        sh '''cd p3backend/DataService
chmod +x mvnw
./mvnw package
./mvnw install dockerfile:build'''
      }
    }

    stage('Build FrontEnd') {
      agent {
        docker {
          image 'node:6-alpine'
        }

      }
      steps {
        sh '''cd p3frontend/
npm i
npm run build'''
      }
    }

  }
}