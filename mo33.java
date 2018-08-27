public class mo33{
public static void main (String args[]){
int col, row;
for(row=1;row<=3;row++) {
	for(col=1;col<=3-row;col++) {
		
		System.out.print(" ");
	}

	for(col=1;col<=row;col++){
		System.out.print("*");
	}

	for(col=2;col<=row;col++){
		System.out.print("*");
	}

	for(col=1;col<=3-row;col++) {
		
		System.out.print(" ");
	}

	System.out.println("");
}

for(row=2;row>=1;row--) {
	for(col=1;col<=3-row;col++) {
		System.out.print(" ");
	}
	
	for(col=1;col<=row;col++){
		System.out.print("*");
	}
	
	for(col=2;col<=row;col++){
		System.out.print("*");
	}

	for(col=1;col<=3-row;col++) {
		System.out.print(" ");
	}

	System.out.println("");
}
}
}