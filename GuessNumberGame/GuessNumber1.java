import java.util.Scanner;
import java.util.Random;

public class GuessNumber1 {
	private static int count = 0;
	
	public static int[] save(int number, int[] numberArray) {
		int hundred = number/100;
		int decade  = (number-hundred*100)/10;
		int unit    = number-hundred*100-decade*10;
		numberArray[0] = hundred;
		numberArray[1] = decade;
		numberArray[2] = unit;		
		return numberArray;
	}
	
	public static void judge(int number) {
		if (number >= 100 && number <= 999) {
			return;
		} else {
			System.err.println("���ݲ��Ϸ�,�������");
			System.exit(0);
		}
	}
	
	public static int rejudge(int[] numberArray1, int[] numberArray2, int i) {
		if (numberArray1[i] > numberArray2[i]) {
			System.out.println("��" + (i+1) + "λ�µ��ˣ�");
		} else if (numberArray1[i] < numberArray2[i]) {
			System.out.println("��" + (i+1) + "λ�¸��ˣ�");
		} else {
			System.out.println("��ϲ�㣬��" + (i+1) + "λ�¶��ˣ�");
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] setNumberArray = new int[3];
		int[] getNumberArray = new int[3];
		
		Random r = new Random();			
		int setNumber = r.nextInt(900)+100;
		judge(setNumber);
		save(setNumber, setNumberArray);

		System.out.println("��������5�λ��������~~~");
		System.out.println("������һ����λ����");
		Scanner scan = new Scanner(System.in);
		
		for (int j= 0; j < 5; j++) {

			int getNumber = scan.nextInt();
			judge(getNumber);			
			save(getNumber, getNumberArray);
			count = 0;
		
			for (int i = 0; i < 3; i++) {
				rejudge(setNumberArray, getNumberArray, i);
			}
			
			if (count == 3) {
				System.out.println("��ϲ�㣬��¶��ˣ�");
				System.exit(0);
			}
			
			if (j == 4) {
				System.out.println("Ҫ�µ����ǣ�" + setNumber);
			}
		}
		
		scan.close();

	}

}
