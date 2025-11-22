package cibertec.controllers;


import cibertec.model.Producto;
import cibertec.repository.ProductoRepository;
import cibertec.services.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    ProductoRepository productoRepo;
    ProductoService productoService;

    public ProductoController(ProductoRepository productoRepo) {
        this.productoRepo = productoRepo;
        this.productoService = productoService;
    }

    //Registrar Nuevo Usuario
    @PostMapping("/registro")
    public ResponseEntity<Producto> registrar(@RequestBody Producto producto) {
        Producto guardado = productoRepo.save(producto);
        return ResponseEntity.ok(guardado);
    }

    @PostMapping("/lote")
    public  ResponseEntity<String> registrarLote(@RequestBody List<Producto> productos) {
        productoService.registrarLote(productos);
        return ResponseEntity.ok("Productos registrados exitosamente");

    }
}
