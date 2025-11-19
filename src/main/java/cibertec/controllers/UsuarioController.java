package cibertec.controllers;

import cibertec.model.Usuario;
import cibertec.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    UsuarioRepository usuarioRepo;

    public UsuarioController(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    //Registrar Nuevo Usuario
    @PostMapping("/registro")
    public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario) {
        Usuario guardado = usuarioRepo.save(usuario);
        return ResponseEntity.ok(guardado);
    }

    //Obtener todos los usuarios registrados
    @GetMapping
    public List<Usuario> listar() {
        return usuarioRepo.findAll();
    }

}
