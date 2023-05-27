package com.usc.crud.controller;

import com.usc.crud.model.Empleado;
import com.usc.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private  UserService service;


    @GetMapping("/consultar/{id}")
    public ResponseEntity<?> filtrar(@PathVariable Long id){

        return ResponseEntity.ok(service.finByUser(id));

    }


    // create employee rest api
    @PostMapping("/guardar")
    public Empleado createEmployee(@RequestBody Empleado empleado) {
        return service.guardarUser(empleado);
    }

    @GetMapping("/consultarAll")
    public ResponseEntity<?> consultarByUser(){

        return ResponseEntity.ok(service.buscarTdoso()
        );
    }

    // update employee rest api
    @PutMapping("/user/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Empleado empleado){
        //String msj = service.guardarUser(empleado);

        empleado.setUser(String.valueOf(empleado));
        empleado.setPassword(String.valueOf(empleado));
        empleado.setEmail(String.valueOf(empleado));
        return ResponseEntity.ok(service.finByUser(id));
    }

    // delete employee rest api
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
       String msj = service.eliminarUser(id);
        return ResponseEntity.ok(msj);
    }

}
