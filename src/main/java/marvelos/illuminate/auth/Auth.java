package marvelos.illuminate.auth;

import marvelos.illuminate.DBCollection;
import marvelos.illuminate.database.mysql.Database;

import java.util.Iterator;

public class Auth {

    private static Database _instance;

    Auth() {
        _instance = Database.getInstance();
    }

    public static String attempt(DBCollection query) {
        String executeQuery = "SELECT * FROM user WHERE";

        return Authenticatable.getChildren().toString();
    }
}
