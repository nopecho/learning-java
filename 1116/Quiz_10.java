import java.util.Scanner;

abstract class PairMap{
	protected String keyArray[]; //key 저장 배열
	protected String valueArray[]; //value 저장 배열
	abstract String get(String key); //key값이 가진 value 리턴, 값이 없으면 null
	abstract void put(String key,String value); // key와 value를 쌍으로 저장, 기존 key가 있으면 값을 value로 수정
	abstract String delete(String key); //key값이 가진 value 둘다 삭제, 삭제된 value 리턴
	abstract int length(); //현제 저장된 아이템 개수 리턴
}
class Dictionary extends PairMap{
	private int count=0;
	
	Dictionary(int arrayLength){
		this.keyArray =new String[arrayLength];
		this.valueArray = new String[arrayLength];
	}
	
	@Override
	String get(String key) {
		if(getKeyIndex(key)<=count) { //keyArray[]의 key의 값이 저장 돼있다면 getKeyIndex(key)의 리턴값은 count보다 무조건 작거나 같음 
			return valueArray[getKeyIndex(key)];
		}return null;
	}
	
	@Override
	void put(String key,String value) {
		if(getKeyIndex(key)!=0) { //key값이 들어왔을때 중복되는 값이 있으면 getKeyIndex(key)의 리턴값은 항상 0보다 큼
			valueArray[getKeyIndex(key)]=value;
			return;
		}
		keyArray[count]=key;
		valueArray[count]=value;
		count++;
	}
	
	@Override
	String delete(String key) {
		String temp = get(key);
		if(getKeyIndex(key)<=count) { //keyArray[]의 key의 값이 저장 돼있다면 getKeyIndex(key)의 리턴값은 count보다 무조건 작거나 같음 
			keyArray[getKeyIndex(key)]=null;
			valueArray[getKeyIndex(key)]=null;
			count--;
		}return temp;
	}
	@Override
	int length() {
		return count+1;
	}
	
	int getKeyIndex(String key) { //key값의 keyArray[]배열의 인덱스 번호 리턴 메소드
		int temp=0;
		for(int i=0;i<keyArray.length;i++) {
			if(key.equals(keyArray[i])) {
				temp=i;
			}
		}return temp;
	}
}

public class Quiz_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사전 길이 설정 : ");
		int num = sc.nextInt();
		Dictionary dic = new Dictionary(num);
		dic.put("황기태","자바");
		dic.put("이재문","c#");
		dic.put("이재문","파이썬");
		dic.put("이재문","C++");
		dic.put("황기태", "스프링");
		dic.put("이재문","C00");
		System.out.println("이재문의 값은 :"+dic.get("이재문"));
		System.out.println("황기태의 값은 :"+dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 :"+dic.get("황기태"));
		sc.close();
	}
}
