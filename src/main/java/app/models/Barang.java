package app.models;

import marvelos.illuminate.database.Model;

public class Barang extends Model {
    protected String table = "barang";

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

