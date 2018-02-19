package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			num = scanner.nextInt();
			int result = 0;
			if(num%2 == 0) {
				int n = 0;
				while(n <= num) {
					result += n;
					n += 2;
				}
			} else {
				int n = 1;
				while(n <= num) {
					result += n;
					n += 2;
				}
			}		
			System.out.println("결과 값: " + result + "\n");
		}
	}
}
