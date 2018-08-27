public class mo22{
public static void main (String args[]){
int col, row;
for(row=1;row<=5;row++) {
	System.out.print("*");

	for(col=2;col<=row;col++) {
		System.out.print(" ");	
	}
	
	for(col=0;col<=5-row;col++){
		System.out.print(row);
	}

	for(col=0;col<=4-row;col++){
		System.out.print(row);
	}

	for(col=2;col<=row;col++) {
		System.out.print(" ");	
	}

	System.out.print("*");

	System.out.println("");
}
}
}