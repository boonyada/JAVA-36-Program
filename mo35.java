public class mo35{
public static void main (String args[]){
int col, row;
for(row=0;row<=4;row++) {

	System.out.print(row+1);

	System.out.print("*");

	for(col=1;col<=1;col++){
		System.out.print(col+row+row);
	}

	System.out.print("*");

	for(col=2;col<=2;col++){
		System.out.print(col+row+row);
	}
	System.out.println("");
}
}
}