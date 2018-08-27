public class mo28{
public static void main (String args[]){
int col, row;
for(row=1;row<=5;row++) {
	for(col=5;col>=row;col--) {
		System.out.print(col);
	}
	
	for(col=1;col<=row;col++) {
		System.out.print("*");
	}
	
	for(col=2;col<=row;col++) {
		System.out.print("*");
	}

	for(col=row;col<=5;col++) {
		System.out.print(col);
	}

	System.out.println("");
}
}
}