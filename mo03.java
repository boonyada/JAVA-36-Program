public class mo03 {
	public static void main(String args[])   {
		int totalRow = 4;
		for (int row=1; row <= totalRow; row++) {
			// Column have 3 parts 
			System.out.print(row + "" + (row + 4));
			for (int col=1; col <= (4 + row); col++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}