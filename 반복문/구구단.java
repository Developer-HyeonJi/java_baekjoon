package 반복문;
import java.util.Scanner;

public class 구구단 {
    public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

		int dan = in.nextInt();
        in.close();
        
		for(int i=1; i<=9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
	}
}
