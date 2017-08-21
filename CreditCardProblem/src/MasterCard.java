
public class MasterCard extends Card{
	
	final double interest  = 0.05;
	
	public MasterCard(){}
	
	public double getTotal(){
		return balance + (balance*interest);
	}
	
	public double getTotalInterest(){
		return balance*interest;
	}

}
