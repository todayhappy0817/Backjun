import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	static int Number(int num) {
		int i,count=0;
		if(num<100) {
			return  num;	
		}
		else {
			for(i=100;i<=num;i++) {
				if((i/100-i%100/10) == (i%100/10-i%100%10)) 
					count++;					
			}
			return 99+count;
		}
		
	}
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		try {
			sb.append(Number(Integer.parseInt(bf.readLine())));
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}

