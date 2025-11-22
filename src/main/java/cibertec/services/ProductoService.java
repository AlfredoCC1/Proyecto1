package cibertec.services;

import cibertec.model.Producto;
import cibertec.repository.ProductoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepo;

    @PersistenceContext
    private EntityManager em;

    public ProductoService(ProductoRepository productoRepo) {
     this.productoRepo = productoRepo;
    }

    public void registrarLote(List<Producto> productos){
        int i = 0;
        for (Producto producto : productos) {
            em.persist(producto);
            i++;
            if(i % 10 == 0){
                em.flush();
                em.clear();
            }
        }
    }
}
