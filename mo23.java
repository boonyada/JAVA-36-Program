public class mo23{
public static void main (String args[]){
int col, row;
for(row=1;row<=5;row++) {
	System.out.print(row);

	for(col=1;col<=7-row;col++) {
		System.out.print("*");	
	}
	
	for(col=2;col<=row;col++) {
		System.out.print(" ");	
	}

	System.out.print(row);

	System.out.println("");
}
}
}