import java.util.Random;
import java.util.Scanner;

public class GuessNumber2 {	
	public static void judge(int number) {
		if (number >= 100 && number <= 999) 
			return;
		else {
			System.err.println("���ݲ��Ϸ�,�������");
			System.exit(0);
		}
	}
	
	public static void rejudge(int number1, int number2) {
		if (number1 > number2) 
			System.out.println("�µ��ˣ�");
		 else if (number1 < number2) 
			System.out.println("�¸��ˣ�");
		 else {
			System.out.println("��ϲ�㣬�¶��ˣ�");
			System.exit(0);			 
		 }

	}
	
	public static void main(String[] args) {	
		Random r = new Random();			
		int setNumber = r.nextInt(900)+100;
		judge(setNumber);

		System.out.println("��������10�λ��������~~~");
		System.out.println("������һ����λ����");
		Scanner scan = new Scanner(System.in);
		
		for (int j= 0; j < 10; j++) {
			int getNumber = scan.nextInt();
			judge(getNumber);				
			rejudge(setNumber, getNumber);			
			if (j == 9) {
				System.out.println("Ҫ�µ����ǣ�" + setNumber);
			}
		}	
		scan.close();
	}
}
