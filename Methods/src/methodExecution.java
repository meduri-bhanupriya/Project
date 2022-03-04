
public class methodExecution {

public int multipynumbers(int a,int b) {
	int c=a*b;
	return c;
}

public static void main(String[] args) {

	methodExecution b=new methodExecution();
	int res= b.multipynumbers(9,5);
	System.out.println("Multipilcation is :"+res);
	}
}
