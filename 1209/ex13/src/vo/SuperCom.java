package vo;

import java.util.ArrayList;
import java.util.List;

public class SuperCom {
    private final List<Memory> memory = new ArrayList<>();
    private String resultOfName;
    private Integer result;

    public List<Memory> getMemory(){
        return memory;
    }
    public void setMemory(Memory memoryAddr){
        memory.add(memoryAddr);
    }
    public int getResult(){
        return result;
    }
    public void setResult(Integer result){
        this.result = result;
    }
    public String getResultOfName(){
        return resultOfName;
    }
    public void setResultOfName(String name){
        this.resultOfName=name;
    }

}
