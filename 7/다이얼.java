import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String number;
		int i,sum=0;
		try {
			number=bf.readLine();
			for(i=0;i<number.length();i++) {
				
				if((number.charAt(i)-'A')==18 || (number.charAt(i)-'A')>=24 || (number.charAt(i)-'A')==21 ) {
					sum+=((number.charAt(i)-'A')/3)+2;
				}
				else {
					sum+=((number.charAt(i)-'A')/3)+3;
				}
				
			}
			sb.append(sum);
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}
//이럴땐 그냥 switch문 
