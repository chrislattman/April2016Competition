import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		median();
	}

	public static void median() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
        	int count = in.nextInt();
        	double sum = 0;
        	for (int j = 0; j < count; j++) {
        		sum += (double) in.nextInt();
        	}
        	double average = sum / count;
        	BigDecimal num = new BigDecimal(average + "");
        	System.out.println(num.setScale(1, RoundingMode.DOWN));
        }
        in.close();
    }
}
