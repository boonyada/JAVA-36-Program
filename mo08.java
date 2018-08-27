public class mo08{
public static void main (String args[]){
for(int row=1;row<=7;row++) {
	for(int col=3;col<=1+row;col++) {
	System.out.print(" ");
	}
	for(int col= row; col<= row; col++){
		System.out.print(row);
		System.out.print(row+1);
		System.out.print(row+2);
	}
	for(int col=2; col<=2+ row; col++){
		System.out.print("*");
	}

	System.out.println("");
}
}
}