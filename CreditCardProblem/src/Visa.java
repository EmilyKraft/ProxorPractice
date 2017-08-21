
public class Visa extends Card{
	
	final double interest  = 0.1;
	
	public Visa(){}
	
	public double getTotal(){
		return balance + (balance*interest);
	}
	
	public double getTotalInterest(){
		return balance*interest;
	}

}
