mvn clean verify sonar:sonar \
  -Dsonar.projectKey=spring-project \
  -Dsonar.host.url=http://sonarqube:9000 \
  -Dsonar.login=sqp_57aeff21d5ada3916b2d5748e6ca4071bf319570
