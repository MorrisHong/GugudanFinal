import java.util.Scanner;

public class Gugudan {
	/*
	클래스를 이용해 구구단을 구현하자.
	
	요구사항
	1.사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
	ex)8을 입력하면 8 * 8까지 출력. 19를 입력하면 19 * 19까지 출력.
	
	2.사용자가 8, 7을 입력하면 팔칠단을 구현한다.
	ex)2 * 1 .. 2 * 7 .. 3 * 1.. 3 * 7.. 8 * 7
	
	hint)
	사용자가 입력한 값을 문자열로 받는다.
	사용자가 입력한 값을 , 로 구분한다.
	쉼표 기준으로 분리한 문자열 값을 숫자로 변경한다
	2중for문을 이용해 출력한다.
	*/
	
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요 : ");
		String s = sc.nextLine();
		sc.close();
		
		String sArr[] = s.trim().split(",");
		int[] iArr = new int[sArr.length];
		for(int i = 0; i < sArr.length; i++) {
			iArr[i] = Integer.parseInt(sArr[i]);
		}
		
		return iArr;
	}
	
	public static void calculatePrint(int num1, int num2) {
		System.out.println(num1);
		System.out.println(num2);

		for(int i = 2; i <= num1; i++) {
			for(int j = 1; j <= num2; j++) {
				System.out.printf("%d * %d = %d\n",i, j, i*j);
			}
			System.out.println();
		}
		System.out.println();
	}

}
