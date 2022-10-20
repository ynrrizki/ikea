package marvelos.illuminate.auth;

import marvelos.illuminate.database.Model;

import java.util.HashSet;
import java.util.Set;

public class Authenticatable extends Model {
    private static Set children = new HashSet();
    public Authenticatable() {
        super();
        synchronized (this) {
            children.add(this);
        }
    }
    public static Set getChildren() {
        return children;
    }
    public String toString() {
        return ("Instance of Class " + getClass().getSimpleName());
    }
}
