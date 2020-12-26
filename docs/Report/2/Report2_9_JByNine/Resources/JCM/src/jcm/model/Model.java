package jcm.model;

import jcm.model.support.IModelAction;

public class Model implements IModelAction {
    protected String table;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void insert() {
    }

    @Override
    public void save() {

    }
    @Override
    public void remove() {
    }

}
