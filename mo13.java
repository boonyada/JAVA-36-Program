public class mo13{
public static void main (String args[]){
for(int row=1; row<=5; row++) {
	for(int col=2; col<= row; col++) {
	System.out.print("..");
	}
	for(int col=11; col>=11; col--){
		System.out.print(col-row-row);
	}
	for(int col=10;col>=6+row;col--){
		System.out.print(col-row-row);
	}
	for(int col=5;col>=1+row;col--){
		System.out.print(col-row);
	}
	System.out.println("");
}
}
}