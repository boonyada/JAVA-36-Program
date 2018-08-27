public class mo02 {
	public static void main(String args[]) {
		int totalRow = 4;
		for (int row=1; row <= totalRow; row++) {
			// Column have 2 parts
			for (int col=row; col <= (row+2); col++) { System.out.print(col); }
			for (int col=1; col <= (2+row); col++) { System.out.print("*"); }
			System.out.println();
		}
	}
}