public class mo01 {
	public static void main(String args[]) {
		int totalRow = 4;
		for (int row=1; row <= totalRow; row++) {
			// Column have 4 parts 
			for (int col=2; col <= row; col++) { System.out.print(" "); }
			System.out.print(row + "" + row);
			for (int col=totalRow; col >= (row + 1); col--) { System.out.print("**"); }
			System.out.println( row + "" + row);
		}
	}
}