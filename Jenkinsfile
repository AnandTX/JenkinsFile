pipeline {
    agent any
    parameters {
      choice choices: ['app1', 'app2'], description: 'App Name', name: 'APP_NAME'
    }

    stages {
      stage('build') {
        steps {
          echo 'Build Stage'
        }
      }

      stage('test') {
        steps {
          echo 'Test Stage'
          bat 'mvn -Dapp=${APP_NAME} --v'
        }
      }

    }

}
