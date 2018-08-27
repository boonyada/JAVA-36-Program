public class mo34{
public static void main (String args[]){
int col, row;
for(row=1;row<=3;row++) {
	for(col=1;col<=3-row;col++) {
		
		System.out.print(" ");
	}


		System.out.print("*");


	for(col=2;col<=row;col++){
		System.out.print(col);
	}
	for(col=row;col<=row;col++) {
		
		System.out.print(col);
	}
	for(col=row;col>=2;col--){
		System.out.print(col);
	}
	System.out.print("*");

	for(col=1;col<=3-row;col++) {
		
		System.out.print(" ");
	}

	System.out.println("");
}

for(row=2;row>=1;row--) {
	for(col=1;col<=3-row;col++) {
		System.out.print(" ");
	}
	
	System.out.print("*");

	for(col=1;col<=row;col++){
		System.out.print(row);
	}
	
	for(col=2;col<=row;col++){
		System.out.print(col);
	}

	System.out.print("*");

	for(col=1;col<=3-row;col++) {
		System.out.print(" ");
	}

	System.out.println("");
}
}
}