import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		binary();
	}

	public static void binary() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			int binary[] = new int[30];
		    int num = in.nextInt();
		    if (num == 0) {
		    	System.out.println(0);
		    	continue;
		    }
		    int index = 0;
		    while (num > 0) {
		    	binary[index] = num % 2;
		    	index++;
		    	num /= 2;
		    }
		    for (int j = index - 1; j >= 0; j--) {
		    	System.out.print(binary[j]);
		    }
		    System.out.println();
		}
		in.close();
	}
}