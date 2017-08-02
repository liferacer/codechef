import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Main ob=new Main();
		long arr[];
		long rohit[]=new long[t];
		
		for(int i=0;i<t;i++){
			long min=(long) Math.pow(10,18);
			int a=sc.nextInt(); 
			arr=new long[a];
			for(int j=0;j<a;j++){
				arr[j]=sc.nextInt();
			}
			
			for(int j=0;j<arr.length-1;j++){
				for(int k=j+1;k<arr.length;k++){
					long val=ob.lcm(arr[j],arr[k]);
					if(val<min){
						min=val;
					} 
				}
			}
			rohit[i]=min;
			
			
		}
		for(int i=0;i<t;i++){
			System.out.println(rohit[i]);
		}
		 sc.close();
	}

	private long lcm(long arr, long arr2) {
		// TODO Auto-generated method stub
		long gcdvalue=gcd(arr,arr2);
		long lcmvalue=(arr*arr2)/gcdvalue;
		return lcmvalue;
	}

	private long gcd(long arr, long arr2) {
		// TODO Auto-generated method stub
		while(arr2!=0){
			long temp=arr2;
			arr2=arr%arr2;
			arr=temp;
		}
		return arr;
	}	
}
