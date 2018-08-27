public class mo19{
public static void main (String args[]){
int col, row;
for(row=1;row<=5;row++) {
	for(col=row;col<=row;col++) {
		System.out.print(col);	
	}	
	for(col=row;col<=9;col++){
		System.out.print("*");
	}
	for(col=2;col<=row;col++){
		System.out.print(" ");
	}	
	for(col=row;col<=row;col++){
		System.out.print(6-row);
	}
	System.out.println("");
}
}
}