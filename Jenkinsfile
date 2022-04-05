pipeline {
    agent any

    stages {

      stage('Compile') {
        steps {
          echo 'Compiling the code'
          bat '''
          cd DummyTest
          mvn clean compile
          '''
        }
      }

      stage('Run tests') {
        steps {
          bat '''
          cd DummyTest
          mvn test
          '''
          echo 'mvn test -Dcucumber.filter.tags="@APItests"'
        }
      }

    }

}
