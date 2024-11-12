package br.com.lontra.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lontra.forum.model.User;
import br.com.lontra.forum.service.UserService;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserService userService;




    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        try {

            userService.registerUser(user);

            return new ResponseEntity<>("Usuário cadastrado com sucesso!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao cadastrar usuário: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
