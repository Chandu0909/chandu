package fundamentals1;

public class eight {

	public static void main(String[] args) {
		char a=args[0].charAt(0);
		if(a=='R')
			System.out.println("Red");
		else if(a=='G')
			System.out.println("Green");
		else if(a=='B')
			System.out.println("Blue");
		else if(a=='O')
			System.out.println("Orange");
		else if(a=='Y')
			System.out.println("Yellow");
		else if(a=='W')
			System.out.println("White");
		else
			System.out.println("invalid code");

	}

}
