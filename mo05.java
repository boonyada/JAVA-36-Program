public class mo05{
public static void main (String args[]){
for(int row=1;row<=4;row++) {
	for(int col=1;col<=4-row;col++) {
	System.out.print(" ");
	}
	System.out.print(row);

	for(int col=2;col<=row;col++){
	System.out.print("**");
	}
	System.out.print(row);
	System.out.println("");
}
for(int row=3;row>=1;row--) {
	for(int col=1;col<=4-row;col++) {
	System.out.print(" ");
	}
	System.out.print(row);
	for(int col=2;col<=row;col++){
	System.out.print("**");
	}
	System.out.print(row);
	System.out.println("");
}
}
}