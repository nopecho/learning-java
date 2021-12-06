package dto;

public class Numbers {
    private final int MAX = 3;
    private final int[] numArray = new int[MAX];

    public Numbers(){
        for(int i=0; i<MAX;i++){
            int rand = (int) (Math.random() * 3) + 1;
            this.numArray[i] = rand;
        }
    }

    public int[] getNumArray() {
        return numArray;
    }
}