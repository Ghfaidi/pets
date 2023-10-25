#!/usr/bin/env groovy

def gv

pipeline {
    agent any
    
    tools {
        maven 'maven'
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }


    
  
        stage("Test then build JAR"){

            steps {
                script {
                    gv.buildJar()
                }
            }
        }
       
        stage("build and push image") {
            steps {
                script {
                    gv.buildImage()
                }
            }
        }

    }


}
