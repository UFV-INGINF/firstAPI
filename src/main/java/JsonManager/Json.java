package JsonManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Asignatura;
import models.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Json {


    public static void readJson(String path) {

        Gson gson = new Gson();

        // Read from file
        // Use class User to convert JSON to Java Object
//        User user = gson.fromJson(path, User.class);
        User user = null;
        try {
            user = new Gson().fromJson(new FileReader("users.json"), User.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println(user);


    }

    public static ArrayList<Asignatura> readJsonArray(String path) {
        User user = null;
        ArrayList<Asignatura> list = null;
        Gson gson = new Gson();
        try {
            list = gson.fromJson(new FileReader("tercero.json"), new TypeToken<ArrayList<Asignatura>>() {}.getType());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println(list);
        return list;
    }

}
