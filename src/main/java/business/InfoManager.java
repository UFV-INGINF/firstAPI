package business;

import JsonManager.Json;
import com.google.gson.Gson;
import models.Asignatura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class InfoManager {

    public ArrayList<Asignatura> asignaturas() {
        ArrayList<Asignatura> asignaturas = Json.readJsonArray("tercero.json");
        return asignaturas;
    }

    public Asignatura asignatura(int index) {
        ArrayList<Asignatura> asignaturas = Json.readJsonArray("tercero.json");
        return asignaturas.get(index);
    }

    public ArrayList<Asignatura> altaAsignatura(Asignatura asignatura) {
        ArrayList<Asignatura> asignaturas = Json.readJsonArray("tercero.json");
        asignaturas.add(asignatura);
        Gson gson = new Gson();
        try {
            FileWriter writer = new FileWriter("tercero.json");
            gson.toJson(asignaturas, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return asignaturas;
    }
}
