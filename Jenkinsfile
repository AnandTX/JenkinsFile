pipeline {
    agent any

    stages {
      stage('build') {
        steps {
          echo 'Build Stage'
        }
      }

      stage('test') {
        steps {
          echo 'Test Stage'
          bat '''
          cd DummyTest
          mvn -Dapp=${APP_NAME} --v
          '''
        }
      }

    }

}
