package com.ucsg.api.intranet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching    // Activa el almacenamiento en caché
@EnableScheduling // Activa la ejecución de tareas programadas
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
