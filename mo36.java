public class mo36{
public static void main (String args[]){
int col, row;
for(row=1;row<=3;row++) {
	for(col=1;col<=4-row;col++){
		System.out.print(row+col-1);
	}

	for(col=1;col<=row;col++){
		System.out.print("*");
	}

	for(col=2;col<=row;col++){
		System.out.print("*");
	}

	for(col=3;col>=row;col--){
		System.out.print(col);
	}

	System.out.println("");
}

for(row=2;row>=1;row--) {
	for(col=1;col<=4-row;col++){
		System.out.print(row+col-1);
	}
	for(col=1;col<=row;col++){
		System.out.print("*");
	}
	for(col=3;col<=1+row;col++){
		System.out.print("*");
	}
	
	for(col=3;col>=row;col--) {
		System.out.print(col);
	}

	System.out.println("");
}
}
}