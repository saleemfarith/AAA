
public class Company extends Employee{
public static void main(String[] args) {

	int a[]= {12,14,56,64,21,12,14,15};
	int count=0;
	String duplicates="";
	
	
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) {
			
			if(a[i]==a[j]) {
				count++;
				duplicates=duplicates+a[i]+" ";
		}
		
		
	}
	}
		System.out.println(count);
		System.out.println(duplicates);
	
	
}
}