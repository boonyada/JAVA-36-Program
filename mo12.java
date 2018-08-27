public class mo12{
public static void main (String args[]){
for(int row=1; row<=5; row++) {
	for(int col=2; col<= row; col++) {
	System.out.print(" ");
	}
	for(int col= row; col<=10- row; col++){
		System.out.print( col);
	}
	System.out.println("");
}
}
}