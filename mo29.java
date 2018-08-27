public class mo29{
public static void main (String args[]){
int col, row;
for(row=1;row<=5;row++) {

	System.out.print(row);

	System.out.print("*");

	System.out.print(2+row);

	for(col=1;col<=2+row;col++) {
		System.out.print("*");
	}

	System.out.println("");
}
}
}