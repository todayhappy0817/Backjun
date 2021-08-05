import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args)throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int num=Integer.parseInt(bf.readLine());
		int flat=1;
		int i=1;
		while(flat<num) {
			flat +=6*i++;
		}
		sb.append(i);
		System.out.println(sb);
		bf.close();
		
	}
}
