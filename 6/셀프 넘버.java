class Test{
	Boolean [] array=new Boolean[10000];
	StringBuilder sb=new StringBuilder();
	int i;
	Test() {
		for(i=0;i<10000;i++) {
			array[i]=true;
		}
	}
	public void print(){
		for(i=0;i<10000;i++) {
			if(array[i]==true) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
	}
	
}

public class Main{
	
	public static int d(int i){
		int sum=i;
		
		for(int j=0; j<String.valueOf(i).length(); j++) {
			sum+=String.valueOf(i).charAt(j)-'0';
		}
		
		return sum;
	}
	
	
    public static void main(String[] args) {
    	Test t1= new Test();
    	int t=1;
		
		for(int i=0;i<10000;i++) {
			t=d(i);
			if(t<10000) {
				t1.array[t]=false;	
			}
		}
		t1.print();
    }
}
