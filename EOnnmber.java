
public class EOnnmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 2;
		System.out.println(EvenOdd(a));

		int b=5;
		System.out.println(EvenOdd(b));
		int c=12;
		System.out.println(EvenOdd(c));
		int d= 19;
		System.out.println(EvenOdd(d));
	}
		public static boolean EvenOdd(int num1) {
			if(num1%2==0) {
				return true;
			}else {
				return false;
			}
		}
}