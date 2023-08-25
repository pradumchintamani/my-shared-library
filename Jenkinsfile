@Library('my-shared-library') _

pipeline{
  agent any
  
  stages{
    stage('demo'){
      steps{
        helloUser("Pradum")
      }
    }
    stage('build'){
      steps{
        build("dev")
      }
    }
    stages{
    stage('sonar scan'){
      steps{
        sonarScan("dev")
      }
    }
  }
}
