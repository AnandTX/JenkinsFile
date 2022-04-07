pipeline {
    agent any

    stages {

      stage('Compile') {
        steps {
          echo '###### Compiling the code ######'
          bat '''
          cd DummyTest
          mvn clean compile
          '''
        }
      }

      stage('Run tests') {
        steps {
        withCredentials([
          usernamePassword(credentialsId: 'Test',
            usernameVariable: 'UNAME_VAR',
            passwordVariable: 'PWD_VAR')
        ])
          echo '###### Run Tests ######'
          bat '''
          cd DummyTest
          mvn -DAPP_NAME=${UNAME_VAR} -DPASSWORD=${PWD_VAR} test
          '''
          echo 'mvn test -Dcucumber.filter.tags="@APItests"'
        }
      }

    }

}
