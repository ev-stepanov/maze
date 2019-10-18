FROM openjdk:8-jre
VOLUME /tmp
EXPOSE 9000
ENV SPRING_PROFILES_ACTIVE production
ENV DATABASE_HOST database
ENV DATABASE_NAME sensei-db
ENV DATABASE_USERNAME sensei
ENV DATABASE_PASSWORD sensei

COPY target/maze-*.jar /app.jar

ENTRYPOINT ["/entrypoint.sh"]
CMD java -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE} -jar /app.jar
