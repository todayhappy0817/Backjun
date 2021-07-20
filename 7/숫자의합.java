import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int count,i,sum=0;
		String str;
		try {
			count=Integer.parseInt(bf.readLine());
			str=bf.readLine();
			for(i=0;i<count;i++) 
				sum+=str.charAt(i)-48;
			sb.append(sum);
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}

