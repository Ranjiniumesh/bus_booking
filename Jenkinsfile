pipeline {
    agent {label 'slave6' }
    stages {
        stage('checkout') {
            steps {
              sh 'rm -rf bus_booking'
            sh 'git clone https://github.com/Ranjiniumesh/bus_booking.git'
            }
        }
        stage ('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn clean install'
            }
        }
        stage('Run JAR Locally'){
        steps {
            sh 'java -jar /home/slave4/workspace/bus_booking_develop/target/bus-booking-app-1.0-SNAPSHOT.jar'
    }
        }
        stage ('deploy') {
               steps {
                   sh 'scp /home/slave6/workspace/busbooking_develop/target/bus-booking-app-1.0-SNAPSHOT.jar root@172.31.2.53:/opt/apache-tomcat-9.0.85/webapps'
}
}
    }
}
