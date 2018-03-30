#!/usr/bin/env groovy
pipeline {

    agent any

    stages {

        stage('Prepare') {
            steps {
                script {
                    checkout scm

                    echo "Build triggered via branch: ${env.BRANCH_NAME}"

                    env.commit_id = sh(script: 'git rev-parse --verify HEAD', returnStdout: true).trim()

                    echo "COMMIT_ID = " + env.commit_id

                    sh "env | sort"
                }
            }
        }

        stage('Gradle Build') {
            steps {
                sh "./gradlew bootJar"
            }
        }

        stage('Docker Build') {
            when {
                branch 'master'
            }

            steps {
                //sh 'docker build -t us.gcr.io/square-trade/acme-server .'
                //sh 'gcloud docker -- push us.gcr.io/square-trade/acme-server'
            }
        }

        stage('Deploy') {
            when {
                branch 'master'
            }

            steps {
                sh 'gcloud app deploy'
            }
        }
    }
}
