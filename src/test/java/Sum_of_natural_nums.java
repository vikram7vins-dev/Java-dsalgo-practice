
public class Sum_of_natural_nums {

	
	public static int rec_sum(int n) {
		if(n==0)
			return 0;
		else return n+rec_sum(n-1);
	}
	public static void main(String[] args) {

  int sum = 0;
  int num = 3;
		for (int i = 0; i <=num; i++) {
			
			sum = sum+i;
			
		}System.out.println(sum);
		System.out.println(rec_sum(num));

		
	}	
		
		
		
	}


