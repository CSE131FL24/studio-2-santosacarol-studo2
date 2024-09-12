package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*double x = Math.random();
		double y = Math.random();
		double point = Math.sqrt(x*x + y*y);*/
		double inside = 0;
		double outside = 0;
		int a = 1000000000;
		for (int i=1000000000; i>0; i--) {
			double x = Math.random();
			double y = Math.random();
			double point = Math.sqrt(x*x + y*y);
			if (point <=1 ) {
				inside++;
				//System.out.print("it's inside!");
			}
			else {
				outside++;
				//System.out.print("it's outside");
			}
		}
		//System.out.println("the dart is at "+x+", "+y);
		//System.out.println (inside);
		System.out.println (4*inside/a);
		//System.out.println (outside);
		System.out.println((double) (inside/a));
		//System.out.println((double) (outside/a));
	}

}
