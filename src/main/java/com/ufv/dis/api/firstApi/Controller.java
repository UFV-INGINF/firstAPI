package com.ufv.dis.api.firstApi;

import business.InfoManager;
import models.Asignatura;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;


@RestController()
public class Controller {

//    @GetMapping("/api/hello")
//    public String hello(@RequestParam String name, @RequestParam String surname) {
//        return "Hello, " + name + " " + surname + "!";
//    }

    @GetMapping("/hello/{name}/{surname}")
    public String hello(@PathVariable("name") String name, @PathVariable("surname") String surname) {
        return "Hello, " + name + " "+ surname + "!";
    }

    @GetMapping("/asignatura")
    public ArrayList<Asignatura> asignaturas() {
        InfoManager infomanager = new InfoManager();
        return infomanager.asignaturas();
    }

    @GetMapping("/asignatura/{index}")
    public Asignatura asignaturaByIndex(@PathVariable("index") int index) {
        InfoManager infomanager = new InfoManager();
        return infomanager.asignatura(index);
    }

    @PostMapping("/api/asignatura")
    public ArrayList<Asignatura> altaAsignatura(@RequestBody Asignatura asignatura) {
        InfoManager infomanager = new InfoManager();
        ArrayList<Asignatura> asignaturas = infomanager.altaAsignatura(asignatura);
        return asignaturas;
    }

}
