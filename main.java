import java.util.Scanner;

public class Metode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		comptadorDeParells(n);
		sc.close();
	}

	static void comptadorDeParellsV3(int n) {
		int count = 0;
		for (int countParell = n; countParell >= 0; countParell--) {
			if (countParell % 2 == 0)
				count++;
		}
		System.out.println(count);
	}

}
