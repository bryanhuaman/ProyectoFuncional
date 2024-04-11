package com.codigo.prografuncional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api-programacion/funcional/")
public class MarcaController {

    //Lista de String
    List<String> lstMarcas = List.of("Mazda", "Audi", "Toyota", "Nissan", "Subaru", "Tesla");
    @GetMapping("/busqueda")
    public ResponseEntity<List<String>> buscarMarca(@RequestParam (required = false) String marca){
        return ResponseEntity.ok(lstMarcas.stream()
                .filter(val -> marca == null || val.startsWith(marca)) //Si la marca esta vacia trae todos ; Si la marca comienza con una letra trae todas las marcas que tengan esa letra
                .collect(Collectors.toList()));
    }

}
