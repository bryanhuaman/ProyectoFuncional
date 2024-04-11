package com.codigo.prografuncional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class PrografuncionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrografuncionalApplication.class, args);

		//Lista de String
		List<String> lstMarcas = List.of("Mazda", "Audi", "Toyota", "Nissan", "Subaru", "Tesla");

		//Funtion consumer (marca)
		lstMarcas.forEach(marca -> System.out.println(marca));

		//streams
		List<String> marcasFiltradas = lstMarcas.stream()//Convertir la lista a un Stream
				.filter(marca ->marca.startsWith("T"))//Marcas que comienzan con T //Filtrando a travez de predicate
				.map(String::toUpperCase)//Los datos son String y pasalos a mayusculas //Convertir todos los elementos de la coleccion a mayusculas con una function
				.collect(Collectors.toList()); //Recolectamos los resultados en otra lista

		marcasFiltradas.forEach(System.out::println);//Todos los elementos de marcas filtradas lo va a imprimir //Imprimo los valores de mi lista filtrada


		//Forma normal
		/*for (int i = 0; i < marcas.size(); i++) {
			System.out.println("Marca de Carro: " + marcas.get(i));
		}*/

		//Filtrado forma antigua
		List<String> filtradomarcas = new ArrayList<>();
		for (int i = 0; i < lstMarcas.size(); i++) {
			if (lstMarcas.get(i).startsWith("T")){
				filtradomarcas.add(lstMarcas.get(i).toUpperCase());
			}
		}

		for (String marca : filtradomarcas){
			System.out.println(marca);
		}


	}

}
