public class mo24{
public static void main (String args[]){
int col, row;
for(row=1;row<=5;row++) {
	System.out.print(row);

	for(col=1;col<=row;col++) {
		System.out.print("*");	
	}
	
	for(col=2;col<=row;col++) {
		System.out.print("*");	
	}

	for(col=5;col>=row;col--) {
		System.out.print(row);
	}

	for(col=5;col>=row;col--) {
		System.out.print(row);
	}

	System.out.println("");
}
}
}