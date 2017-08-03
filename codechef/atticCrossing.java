import java.util.*;
public class atticCrossing {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			int days=0;
			int length=0;
			int j=0;
			String str=sc.next();
			for(int i=1;i<str.length();i++){
				int count=0;
				if(str.charAt(i)=='.'){
					for(j=i;j<str.length();j++){
						if(str.charAt(j)=='.'){
							count+=1;
						}
						else{
							break;
						}
					}
					if(count>length){
						length=count;
						days+=1;
					}
					i=j;
				}
			}
			System.out.println(days);
			
			t-=1;
		}
	}
}