public class mo32{
public static void main (String args[]){
int col, row;
for(row=1;row<=5;row++) {
	for(col=1;col<=8-row;col++) {
		System.out.print(col);	
	}

	for(col=1;col<=2+row;col++) {
		System.out.print("*");	
	}
	
	System.out.print(row+2);

	System.out.println("");
}
}
}