
public class Client extends Company {

	public static void main(String[] args) {
		

		int a[]= {12,56,64,21,14,15};
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

					
				}
	}

		
}

		System.out.println(a[5]);
		System.out.println(a[a.length-1]);

		


		}

		
		
	}