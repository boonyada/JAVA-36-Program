public class mo10{
public static void main (String args[]){
for(int row=1; row<=5; row++) {
	for(int col=1; col<=5- row; col++) {
	System.out.print(" ");
	}
	for(int col=1; col<= row; col++){
		System.out.print( col);
	}
	for(int col= row; col<= row; col++){
		System.out.print(6- row);
	}
	for(int col= row; col>=1; col--){
		System.out.print( col);
	}
	System.out.println("");
}
}
}