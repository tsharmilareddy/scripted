node {
    stage('ci') {
        aws ecr get-login-password --region us-east-2 |  docker login --username AWS --password-stdin 109657631540.dkr.ecr.us-east-2.amazonaws.com
         sudo docker build -t 109657631540.dkr.ecr.us-east-2.amazonaws.com/ecr:latest
       sudo docker push 109657631540.dkr.ecr.us-east-2.amazonaws.com/ecr:latest
    }
}