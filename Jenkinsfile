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
          mvn test
          '''
        }
      }

      stage('Actual Command') {
        steps {
          bat 'mvn test'
          echo 'mvn test -Dcucumber.filter.tags="@APItests"'
        }
      }

    }

}
