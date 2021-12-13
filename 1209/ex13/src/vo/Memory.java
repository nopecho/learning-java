package vo;

import util.Util;

import java.util.HashMap;

public class Memory {
    private final HashMap<String, Integer> memoryAddr = new HashMap<>();
    private String memoryName,memoryKey,memoryValue;

    public Memory() {
    }

    public Memory(String name, String key, String value) {
        this.memoryName = name;
        this.memoryKey = key;
        this.memoryValue = value;
    }

    public HashMap<String, Integer> getMemoryAddr() {
        return memoryAddr;
    }

    public void setMemoryAddr(String key, Integer value) {
        memoryAddr.put(key, value);
    }

    public void update(SuperCom com) {
        for (Memory memory : com.getMemory()) {
            if (memory.getMemoryAddr().containsKey(memoryKey)) {
                Integer prevAddr = memory.getMemoryAddr().get(memoryKey);
                if (memoryName.equals("add")) {
                    memory.setMemoryAddr(memoryKey, prevAddr + Util.castingValue(com,memoryValue));
                } else if (memoryName.equals("sub")) {
                    memory.setMemoryAddr(memoryKey, prevAddr - Util.castingValue(com,memoryValue));
                }
            }
        }
    }
}
