public class mo16{
public static void main (String args[]){
for(int row=1; row<=5; row++) {	
	for(int col= row; col>=1; col--){
		System.out.print(col);
	}
	for(int col=1; col<=5- row; col++){
		System.out.print("..");
	}
	for(int col= row; col>=1; col--){
		System.out.print("*");
	}
	System.out.println("");
}
}
}