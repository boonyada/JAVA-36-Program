public class mo11{
public static void main (String args[]){
for(int row=1; row<=5; row++) {
	for(int col=1; col<=5- row; col++) {
	System.out.print(" ");
	}
	for(int col= row; col<= row; col++){
		System.out.print( row);
	}
	for(int col=2; col<= row; col++){
		System.out.print(" ");
	}
	System.out.print( row);
	System.out.println("");
}
}
}