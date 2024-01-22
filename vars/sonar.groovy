def call() {
       // Your SonarQube scan steps go here
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://3.110.40.153:9000/ -Dsonar.java.binaries=target/classes'
   }
return this
