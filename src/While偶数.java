
public class While偶数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
      int a=0;
      int b=0;
      int c=0;
      int sum=0;
   
		while(a<=100){
			sum++;
			a=a+2;
			System.out.print(a+"\t");
			if(sum%5==0){
				System.out.println();
		}

		}
	}

}
