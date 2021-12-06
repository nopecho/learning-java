package svc;

import dto.Person;


public class WinnerCheckSvc {
    public boolean checkWinner(Person person) {
        int[] temp = person.getNumbers().getNumArray();
        int check = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if(check==temp[i]){
                check=temp[i];
            }else{
                return false;
            }
        }return true;
    }
}