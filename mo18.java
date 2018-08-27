public class mo18{
public static void main (String args[]){
int col;
for(int row=1;row<=5;row++) {
	for(col=row;col<=row;col++) {
		System.out.print(col);	
	}
	for(col=1;col<=row;col++) {
		System.out.print("*");
	}
	System.out.print(col-1);
	for(col=1;col<=6-row;col++) {
		System.out.print("*");
	}
	System.out.print(col+3);
	System.out.println("");
}
}
}