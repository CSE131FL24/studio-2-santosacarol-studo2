package studio2;

public class Ruin {

	public static void main(String[] args) {
		double startAmount = 2.0;
		double a = startAmount;
		double winProbability = 0.5;
		double winLimit = 6.0;
		int rounds = 0;
		double lose = 0;
		while (startAmount < winLimit) {
			rounds++;
			if (Math.random()>winProbability) {
				startAmount +=1;
				System.out.println("Simulation "+ rounds +  " " + startAmount + " WIN");
			}
			else if ((startAmount == 0)||(startAmount == winLimit)) {
				rounds--;
				if (startAmount == 0) {
				System.out.println("Ruin!");
				 break;
				}
				else {
					System.out.println("Success!");
					break;
				}
			}
			else {
				startAmount-=1;
				System.out.println("Simulation "+ rounds +  " " + startAmount + " LOSE");
				lose++;
			}
		}
		System.out.println("total number of simulations: "+ (rounds));
		System.out.println("ruin rate from simulation "+(lose)/(rounds));
		System.out.print("theoretical ruin rate "+ (1.0- (double)(a/winLimit)));

	}

}
