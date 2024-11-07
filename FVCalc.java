// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int startValue = Integer.parseInt(args[0]);
		double interestRate = Double.parseDouble(args[1]) / 100;
		int years = Integer.parseInt(args[2]);

		double interestOverTime = Math.pow(interestRate + 1, years);
		double futureValue = startValue * interestOverTime;
		// After 2 years, $100 saved at 10.0% will yield $121
		System.out.println("After " + years + " years, $" + startValue + " saved at " + 
							(interestRate * 100) + "% will yield $" + (int)futureValue);
	}
}