node {

    stage('Checkout'){
        git 'https://github.com/agentch/springboot-demo.git'
    }

    stage('Package'){
        sh 'mvn package -Dmaven.test.skip=true'
    }

    stage('Image'){
        sh 'docker build -t app .'
        sh 'docker tag app 10.70.24.57:8088/app'
        sh 'docker push 10.70.24.57:8088/app'
    }

}