package practice;

import java.util.*;

public class Appliction {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Millano");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
/*
        1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정리하시오.
        2. 거래자가 근무하는 모든 도시를 중복없이 나열하시오
        3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        4. 모든 거래자의 이름을 알파벳순으로 정리해서 반환하시오
        5. 밀라노에 거래자가 있는가?
        6. 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
        7. 전체 트랜잭션 중 최댓값은 얼마인가?
        8. 전체 트랜잭션 중 최솟값은 얼마인가?
*/
        //1번
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .forEach(System.out::println);
        System.out.println("****************************************");

        //2번
        transactions.stream()
                .map(Transaction::getTrander)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
        System.out.println("****************************************");

        //3번
        transactions.stream()
                .map(Transaction::getTrander)
                .filter(trander -> trander.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("****************************************");

        //4번
        transactions.stream()
                .map(Transaction::getTrander)
                .map(Trader::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println("****************************************");

        //5번
        if(transactions.stream()
                .map(Transaction::getTrander)
                .anyMatch(trader -> trader.getCity().equals("Millano"))){
            System.out.println("밀라노 있음");
        }else{
            System.out.println("밀라노 없음");
        }

        System.out.println("****************************************");

        //6번
        transactions.stream()
                .filter(transaction -> transaction.getTrander().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        System.out.println("****************************************");

        //7번
        int maxResult = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                .get();
        System.out.println(maxResult);
        System.out.println("****************************************");

        //8번
        int minResult =transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();
        System.out.println(minResult);
        System.out.println("****************************************");

}
