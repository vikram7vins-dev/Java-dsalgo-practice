
public class power {
	
	static int power(int a,int b) {
		if(b>=1)
			return a*power(a, b-1);
		else return 1;
	}
	static int power2(int a,int b) {
		if(b==1)
			return 1;
		
		else return a*power(a, b-1);
	}
	public static void main(String[] args) {
		
		System.out.println(power(6, 5));
        System.out.println(power2(6, 5));
	}

}
