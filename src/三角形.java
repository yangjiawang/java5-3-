
public class Èý½ÇÐÎ {
public static void main(String[] args) {
	for(int i=0;i<8;i++){
		for(int j=0;j<i;j++ ){
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	for(int i=1;i<=10;i++){
       for(int a=10-i;a>=1;a--){
			//System.out.print(a);
			System.out.print(" ");
		}
		for(int c=0;c<i*2-1;c++){
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
