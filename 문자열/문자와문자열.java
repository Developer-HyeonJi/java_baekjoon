package 문자열;
import java.util.Scanner;

public class 문자와문자열 {
    public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

        String[] a = in.next().split("");
		int b = in.nextInt();

		System.out.println(a[b-1]);
        
	}
}
