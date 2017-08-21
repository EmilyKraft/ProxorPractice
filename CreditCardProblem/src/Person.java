import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private List<Wallet> wallets = new ArrayList<Wallet>();

	public Person(){}
	
	public List<Wallet> getWallets() {
		return wallets;
	}

	public void setWallets(List<Wallet> wallets) {
		this.wallets = wallets;
	}

	public double getTotal(){
		double total = 0;
		for (int i = 0; i < wallets.size(); i++){
			total+= wallets.get(i).getWalletTotal();
		}
		return total;
	}
	
	public double getTotalInterest(){
		double total = 0;
		for (int i = 0; i < wallets.size(); i++){
			total+= wallets.get(i).getWalletInterest();
		}
		return total;
	}
}
