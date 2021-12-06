package svc;

import dto.Numbers;
import dto.Person;
import view.ConsoleMsg;

public class GamePlaySvc {
    public void play(Numbers numbers, Person person, ConsoleMsg msg){
        person.setNumbers(numbers);
        msg.printNumbers(numbers.getNumArray());
    }
}