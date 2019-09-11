import java.util.Arrays;

public class Employee {
	public static void main(String[] args) {
		int a[] = { 13, 55, 23, 343, 12, 13, 14 };
		Arrays.sort(a);
		int temp[] = new int[a.length];
		int m=0;
		for (int i = 0; i < temp.length-1; i++) {
			if(a[i]!=a[i+1]) {
				temp[i]=a[i];
				m++;
			}
		}

		temp[m]=a[a.length-1];
		for (int i = 0; i <=m; i++) {
			System.out.println(temp[i]);
			
		}
		
	}
}
