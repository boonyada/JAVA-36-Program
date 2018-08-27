public class mo06{
public static void main (String args[]){
for(int row=1;row<=7;row++) {
	for(int col=2;col<=1+row;col++) {
	System.out.print(" ");
	}
	for(int col=1;col<=1;col++){
	System.out.print(col);
	}
	for(int col=row;col<=6;col++){
	System.out.print("01");
	}
	System.out.println("");
}
}
}