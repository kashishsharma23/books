pipeline{
  agent any
  tools{
    maven 'maven_3_5_0'
  }
  stages{
    stage('Build maven'){
      steps{
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kashishsharma23/books.git']]])
        sh 'mvn clean install'
      }
    }
  }
}
