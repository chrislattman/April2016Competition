import java.util.Scanner;
import java.util.Stack;

public class Parentheses {

	public static void main(String[] args) {
		parentheses();
	}

	public static void parentheses() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		for (int i = 0; i < N; i++) {
			Stack<String> balance = new Stack<String>();
			String[] symbols = in.nextLine().split("");
			for (int j = 0; j < symbols.length; j++) {
				if (balance.isEmpty() && symbols[j].equals(")")) {
					balance.push(symbols[j]);
					break;
				}
				else if (balance.isEmpty()) {
					balance.push(symbols[j]);
				}
				else if (balance.peek().equals(symbols[j])) {
					balance.push(symbols[j]);
				}
				else {
					balance.pop();
				}
			}
			System.out.println(balance.empty());
		}
		in.close();
	}
}