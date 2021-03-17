FROM openjdk:8
#copy the jar file from target to current directory
COPY ./calc_spe/target/calc_spe-0.0.1-SNAPSHOT-jar-with-dependencies.jar ./ 
#make current directory my working directory
WORKDIR ./            
#run the command to run the calc app
CMD ["java","-jar", "target/calc_spe-0.0.1-SNAPSHOT-jar-with-dependencies.jar"]