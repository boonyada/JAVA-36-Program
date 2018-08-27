public class mo07{
public static void main (String args[]){
for(int row=1;row<=7;row++) {
	for(int col=0;col<=7-row;col++) {
	System.out.print(" ");
	}
	for(int col=1;col<=1;col++){
		System.out.print(col);
	}
	for(int col=3;col<=1+row;col++){
		System.out.print(col-1);
	}
		System.out.print(row);
	for(int col=row;col>=1;col--){
		System.out.print(col);
	}
	System.out.println ("");
}
}
}