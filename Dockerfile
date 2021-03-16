FROM openjdk:8
COPY ./calc_spe/target/calc_spe-0.0.1-SNAPSHOT.jar./
WORKDIR ./
CMD ["java","-jar", "target/calc_spe-0.0.1-SNAPSHOT.jar"]