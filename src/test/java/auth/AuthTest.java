package auth;

import marvelos.illuminate.DBCollection;
import marvelos.illuminate.auth.Auth;
import org.junit.jupiter.api.Test;

public class AuthTest {
    @Test
    public void authStatement() {
        String[] column = {};
        String[] value = {};
        DBCollection query = new DBCollection(column, value);
        System.out.println(Auth.attempt(query));
    }
}
