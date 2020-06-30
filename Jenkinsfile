pipeline {
  agent any
  stages {
    stage('Build Data') {
      steps {
        sh '''cd p3backend/DataService
chmod +x mvnw
./mvnw package
./mvnw install dockerfile:build'''
      }
    }

  }
}