public class mo21{
public static void main (String args[]){
int col, row;
for(row=1;row<=5;row++) {
	for(col=row;col<=7;col++){
		System.out.print("*");
	}
	
	System.out.print(row);

	for(col=1;col<=row;col++){
		System.out.print("*");
	}

	for(col=row;col<=row;col++){
		System.out.print(8-row);
	}

	System.out.println("");
}
}
}