public class mo09{
public static void main (String args[]){
for(int row=1; row<=5; row++) {
	for(int col=3; col<=1+ row; col++) {
	System.out.print(" ");
	}
	for(int col=0; col<=5- row; col++){
		System.out.print( row);
	}
	for(int col=0; col<=4- row; col++){
		System.out.print( row);
	}
	System.out.println("");
}
}
}