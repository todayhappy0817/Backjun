import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int A,B;
		try {
			StringTokenizer st =new StringTokenizer(bf.readLine());
			A=Integer.parseInt(st.nextToken());
			B=Integer.parseInt(st.nextToken());
			A=(A%100%10*100)+(A/10%10*10)+A/100;
			B=(B%100%10*100)+(B/10%10*10)+B/100;
			
			if(A>B) {
				sb.append(A);
			}
			else {
				sb.append(B);
			}
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			
		}
	}
}

