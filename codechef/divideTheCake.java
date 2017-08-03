import java.util.*; 
public class divideTheCake {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		char ans1='\0';
		char ans2='\0';
		char ans3='\0';
		while(t>0){
			int n=sc.nextInt();
			if(360%n==0){
				ans1='y';
			}
			else
				ans1='n';
			
			if(n<=360){
				ans2='y';
			}
			else
				ans2='n';
			
			if(n<=26){
				ans3='y';
			}
			else
				ans3='n';
			System.out.println(ans1+" "+ans2+" "+ans3);
			t-=1;
		}
		
		
	}
}
