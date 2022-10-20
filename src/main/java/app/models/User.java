package app.models;

import marvelos.illuminate.auth.Authenticatable;

public class User extends Authenticatable {
    protected String table;

    @Override
    public void setTable(String table) {
        table = this.table;
        super.setTable(table);
    }

    @Override
    public String getTable() {
        return table;
    }
}

