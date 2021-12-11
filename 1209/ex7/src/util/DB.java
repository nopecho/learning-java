package util;

import vo.Student;
import java.util.HashMap;
import java.util.Map;

public class DB {
    private final Map<String, Student> studentDB;

    public DB(){
        studentDB = new HashMap<>(5);
    }

    public Map<String, Student> getDB(){
        return studentDB;
    }
}
