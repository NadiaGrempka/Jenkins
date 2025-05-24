# # Use the official Jenkins LTS image as a base
# FROM jenkins/jenkins:lts

# # Set environment variables to disable the setup wizard
# ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false ${JAVA_OPTS:-}"

# # Expose Jenkins ports
# EXPOSE 8080
# EXPOSE 50000

# # docker build -t my-jenkins .

# # docker run -d \
# #   -p 8080:8080 \
# #   -p 50000:50000 \
# #   -v jenkins_home:/var/jenkins_home \
# #   --name jenkins \
# #   my-jenkins

# # stepik config?

# Dockerfile
FROM jenkins/jenkins:lts

# (opcjonalnie) jeżeli potrzebujesz dodatkowych narzędzi w kontenerze:
USER root
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
      git \
      curl \
      # inne narzędzia, np. maven, docker-cli itp. \
    && rm -rf /var/lib/apt/lists/*

# wróć do użytkownika jenkins (domyślny)
USER jenkins

# Domyślnie Jenkins wystawia port 8080, ale deklarujemy go jawnie:
EXPOSE 8080

# Katalog /var/jenkins_home to wolumen z danymi
VOLUME /var/jenkins_home

# ENTRYPOINT i CMD są już zdefiniowane w obrazie bazowym jako
# /usr/bin/tini -- /usr/local/bin/jenkins.sh
# więc nie musimy ich nadpisywać

# docker build -t my-jenkins .

# docker run -d --name jenkins -p 8080:8080 -v $HOME/jenkins_home:/var/jenkins_home my-jenkins

# mvn clean generate-sources -Pprepare-lib
# duze zmiany w pom.xml byly