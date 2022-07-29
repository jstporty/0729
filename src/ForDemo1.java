import java.util.Scanner;

public class ForDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("몇단?:");
//       int dan = sc.nextInt();
//		for (int i = 1; i < 10; i++){
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//			
//		}
		// ★★★★★
//		for (int i = 1; i < 6; i++) {
//		System.out.print("★\n");  //System.out.println("★");			
//		}
		/*
		 * ★ ★★ ★
		 */
//		for (int i = 1; i < 6; i++) {// 밑으로 내려가는 반복
//			for (int j = 1; j <= i; j++) {// 옆으로 가는 반복
//			System.out.print("★\t");
//			}
//			System.out.println();
//		}

		for (int i = 5; i >0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★\t");
			}
			System.out.println();	
		}

//	

//		for (int i = 1; i <= 9; i++) {// 밑으로 내려가는 반복
//			for (int j = 2; j <= 10; j++) {// 옆으로 가는 반복
//			System.out.printf("%d x %d = %d\t\t", j, i,j * i);
//			}
//			System.out.println();
//		}
	}
}