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
    stage('sonar scan'){
      steps{
        sonarScan("dev")
      }
    }
    stage('docker build'){
      steps{
        dockerBuild("dev")
      }
    }
    stage('pushImage'){
      steps{
        pushImage("dev")
      }
    }
    stage('Deploy'){
      steps{
        deploy("dev")
      }
    }
  }
}
