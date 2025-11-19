package cibertec.controllers;


import cibertec.model.Producto;
import cibertec.repository.ProductoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    ProductoRepository productoRepo;

    public ProductoController(ProductoRepository productoRepo) {
        this.productoRepo = productoRepo;
    }

    //Registrar Nuevo Usuario
    @PostMapping("/registro")
    public ResponseEntity<Producto> registrar(@RequestBody Producto producto) {
        Producto guardado = productoRepo.save(producto);
        return ResponseEntity.ok(guardado);
    }
}
