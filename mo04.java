public class mo04 {
	public static void main(String args[]) {
		int totalRow = 4;
		for (int row=1; row <= totalRow; row++) {
			// Column have 3 parts 
			for (int col=1; col <= row; col++) { System.out.print("*"); }
			for (int col=row; col >= 2; col--) { System.out.print(col); }
			for (int col=1; col <= row; col++) { System.out.print(col); }
			System.out.println();
		}
	}
}