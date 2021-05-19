
public class Flowchart {

	public static void main(String[] args) {
		int n = 100;
		flowchart(n);
	}

	public static void flowchart(int n) {
		while (n <= 200) {
			if (n % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			n++;
		}
	}
}
