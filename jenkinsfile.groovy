node {
    stage('ci') {
        aws ecr get-login-password --region us-east-1 | sudo docker login --username AWS --password-stdin 109657631540.dkr.ecr.us-east-1.amazonaws.com
         sudo docker build -t 109657631540.dkr.ecr.us-east-1.amazonaws.com/ecr:latest
       sudo docker push 109657631540.dkr.ecr.us-east-1.amazonaws.com/ecr:latest
    }
}