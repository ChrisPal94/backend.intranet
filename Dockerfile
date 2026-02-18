# ETAPA 1: Build (Usamos Maven y JDK completo)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
# Empaquetamos saltando los tests para agilizar el build
RUN mvn clean package -DskipTests

# ETAPA 2: Runtime (Usamos solo lo necesario para correr)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Copiamos solo el jar generado en la etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Configuración opcional de Java para contenedores
ENV JAVA_OPTS="-Xms512m -Xmx512m"

EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]