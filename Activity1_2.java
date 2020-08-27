package JavaActivity2;

public class JavaActivity2 {

	public static void main(String[] args) {
		int[] A = {10, 77, 10, 54, -11, 10};
		calculation(A);
	}
		public static void calculation(int[] num)
		
		{
			int count = num.length;
			int i;
			int Total = 0;
			for (i=0;i<count;i++)
			{
				if(num[i] == 10)
				Total = Total+num[i];
				
			}
			if(Total == 30)
			System.out.println("Total of given numbers is: "+Total);
			else
			System.out.println("Total of given numbers is not equal to 30 ");
		}

	}


