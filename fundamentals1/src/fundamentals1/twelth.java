package fundamentals1;

public class twelth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0,count=0,num=Integer.parseInt(args[0]);
		
		for(i=1;i<=num;i++)
		{
		
			if(num%i==0)
				count++;
		}
		
		if(count==2)
			System.out.println("Given Number "+num+" is Prime");
		else
			System.out.println("Given Number "+num+" is Not Prime");
	}

	}
