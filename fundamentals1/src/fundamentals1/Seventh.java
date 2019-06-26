package fundamentals1;

public class Seventh {

	public static void main(String[] args) {
		char a =args[0].charAt(0);
		if(a>='a' && a<='z')
			System.out.println(Character.toUpperCase(a));
		else
			System.out.println(Character.toLowerCase(a));

	}

}
