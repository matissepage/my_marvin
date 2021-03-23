FROM jenkins/jenkins:lts
COPY job_dsl.groovy /usr/share/jenkins/ref/init.groovy.d/job_dsl.groovy