import java.util.Scanner;

abstract class PairMap{
	protected String keyArray[]; //key ���� �迭
	protected String valueArray[]; //value ���� �迭
	abstract String get(String key); //key���� ���� value ����, ���� ������ null
	abstract void put(String key,String value); // key�� value�� ������ ����, ���� key�� ������ ���� value�� ����
	abstract String delete(String key); //key���� ���� value �Ѵ� ����, ������ value ����
	abstract int length(); //���� ����� ������ ���� ����
}
class Dictionary extends PairMap{
	private int count=0;
	
	Dictionary(int arrayLength){
		this.keyArray =new String[arrayLength];
		this.valueArray = new String[arrayLength];
	}
	
	@Override
	String get(String key) {
		if(getKeyIndex(key)<=count) { //keyArray[]�� key�� ���� ���� ���ִٸ� getKeyIndex(key)�� ���ϰ��� count���� ������ �۰ų� ���� 
			return valueArray[getKeyIndex(key)];
		}return null;
	}
	
	@Override
	void put(String key,String value) {
		if(getKeyIndex(key)!=0) { //key���� �������� �ߺ��Ǵ� ���� ������ getKeyIndex(key)�� ���ϰ��� �׻� 0���� ŭ
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
		if(getKeyIndex(key)<=count) { //keyArray[]�� key�� ���� ���� ���ִٸ� getKeyIndex(key)�� ���ϰ��� count���� ������ �۰ų� ���� 
			keyArray[getKeyIndex(key)]=null;
			valueArray[getKeyIndex(key)]=null;
			count--;
		}return temp;
	}
	@Override
	int length() {
		return count+1;
	}
	
	int getKeyIndex(String key) { //key���� keyArray[]�迭�� �ε��� ��ȣ ���� �޼ҵ�
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
		System.out.print("���� ���� ���� : ");
		int num = sc.nextInt();
		Dictionary dic = new Dictionary(num);
		dic.put("Ȳ����","�ڹ�");
		dic.put("���繮","c#");
		dic.put("���繮","���̽�");
		dic.put("���繮","C++");
		dic.put("Ȳ����", "������");
		dic.put("���繮","C00");
		System.out.println("���繮�� ���� :"+dic.get("���繮"));
		System.out.println("Ȳ������ ���� :"+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� :"+dic.get("Ȳ����"));
		sc.close();
	}
}
