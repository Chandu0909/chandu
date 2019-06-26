package fundamentals1;

public class Sixth {
	public static void main(String[] args)
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(args[0].equals("Female")&& age>=1 && age<=58)
			System.out.println("8.2%");
		if(args[0].equals("Female")&& age>=59 && age<=100)
			System.out.println("9.2%");
		if(args[0].equals("Male")&& age>=1 && age<=58)
			System.out.println("8.4%");
		if(args[0].equals("Male")&& age>=59 && age<=100)
			System.out.println("10.5%");
	}

}
