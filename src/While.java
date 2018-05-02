
public class While {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   double sum = 0;
    int Tian=0;
    int Tian2=0;
		while(sum<=100.00){
	Tian++;
	//System.out.println("天数："+Tian);
	if(Tian%5==0){
		sum-=6;
	}
	sum=sum+2.5;
	//System.out.println("钱："+sum);
		}
		System.out.println("天数："+Tian);
	}

}
