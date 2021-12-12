package controller;

import dao.Dao;
import util.DB;

public class Controller {
    public void request(Dao dao, DB db){
        dao.response(db);
    }
}
