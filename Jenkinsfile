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
          {
            echo '###### Run Tests ######'
            bat '''
            cd DummyTest
            mvn -Dapp=${PWD_VAR} -Dpass=${UNAME_VAR} test
            echo '###############################################################'
            mvn -Dapp=${UNAME_VAR} -Dpass=${PWD_VAR} test
            '''
            echo 'mvn test -Dcucumber.filter.tags="@APItests"'
          }
        }
      }
    }
}
