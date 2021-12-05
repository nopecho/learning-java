package view;

import dto.Person;

public class ConsoleMsg {

    public void aFewPersonMsg(){
        System.out.print("게임 참가 인원 입력 : ");
    }

    public void insertNameMsg(int num){
        System.out.print(num+"번째 플레이어 이름 : ");
    }

    public void continueGameMsg(Person person){
        System.out.print(person.getName()+": <ENTER> ");
    }

    public void failMsg(){
        System.out.println("실패 !");
    }

    public void successMsg(Person person){
        System.out.println(person.getName()+ "님 * 성공 * ");
    }

    public void printNumbers(int[] numbers){
        for(int i : numbers){
            System.out.print(i+"\t");
        }
    }
}
