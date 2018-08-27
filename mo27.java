public class mo27{
public static void main (String args[]){
int col, row;
for(row=1;row<=5;row++) {

	System.out.print(row);

	for(col=1;col<=row;col++) {
		System.out.print(" ");	
	}
	
	for(col=1;col<=row;col++) {
		System.out.print("*");	
	}

	System.out.println("");
}
}
}