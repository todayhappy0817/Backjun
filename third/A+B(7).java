
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		try {
			int count = Integer.parseInt(bf.readLine());
			String str;
			String[] num;
			for(int i=1; i<=count; i++) {
				str = bf.readLine();
				num = str.split(" ");
				sb.append("Case #").append(i+": ").append(Integer.parseInt(num[0])+Integer.parseInt(num[1])).append("\n");
			}
			System.out.println(sb);
			bf.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

스프릿 토큰을 사용하면 더욱 메모리를 줄일 수 있을거 같다.
