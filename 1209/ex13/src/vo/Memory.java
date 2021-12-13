package vo;

import java.util.HashMap;

public class Memory {
    private final HashMap<String, Integer> memoryAddr = new HashMap<>();
    private String memoryName;
    private String memoryKey;
    private Integer memoryValue;

    public Memory() {
    }

    public Memory(String name, String key, Integer value) {
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
                    memory.setMemoryAddr(memoryKey, prevAddr + memoryValue);
                } else if (memoryName.equals("sub")) {
                    memory.setMemoryAddr(memoryKey, prevAddr - memoryValue);
                }
            }
        }
    }
}
