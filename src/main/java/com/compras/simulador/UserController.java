package com.compras.simulador;

import com.compras.simulador.Entity.User;
import com.compras.simulador.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserRepository repository;


    @GetMapping
    public String index(Model model, User user) {
        model.addAttribute("user", new User());
        model.addAttribute("users", repository.findAll());
        return "index";
    }

    @PostMapping("/enviarConsulta")
    public String enviarConsulta(Model model, User user) {
        repository.save(user);
        model.addAttribute("user", new User());
        model.addAttribute("users", repository.findAll());
        return "index";
    }

    @GetMapping("/editarConsulta/{id}")
    public String editarConsultaForm(Model model, @PathVariable(name="id") Long id) {
        User usuarioParaEditar = repository.findById(id).get();
        model.addAttribute("user", usuarioParaEditar);
        model.addAttribute("users", repository.findAll());
        return "index";
    }

    @GetMapping("/eliminarConsulta/{id}")
    public String eliminarConsulta(Model model, @PathVariable(name="id") Long id) {
        User usuarioParaEliminar = repository.findById(id).get();
        repository.delete(usuarioParaEliminar);
        model.addAttribute("user", new User());
        model.addAttribute("users", repository.findAll());
        return "index";
    }
}
