public class mo20{
public static void main (String args[]){
int col, row;
for( row=1; row<=5; row++) {
	for( col=1; col<= row; col++) {
		System.out.print( row);	
	}
	for(col=1;col<=row;col++) {
		System.out.print("*");	
	}
	for(col=1;col<=row;col++) {
		System.out.print(row);	
	}
	System.out.println("");
}
}
}