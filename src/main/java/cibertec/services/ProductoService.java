package cibertec.services;

import cibertec.repository.ProductoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    private final ProductoRepository productoRepo;

    @PersistenceContext
    private EntityManager em;

    public ProductoService(ProductoRepository productoRepo) {
     this.productoRepo = productoRepo;
    }
}
