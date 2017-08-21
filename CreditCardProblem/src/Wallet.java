import java.util.ArrayList;
import java.util.List;

public class Wallet {
	
	List <Card> cards = new ArrayList<Card>();
	
	public Wallet(){}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public double getWalletTotal(){
		double total = 0;
		for (int i = 0; i < cards.size(); i++){
			total+= cards.get(i).getTotal();
		}
		return total;
	}
	
	public double getWalletInterest(){
		double total = 0;
		for (int i = 0; i < cards.size(); i++){
			total+= cards.get(i).getTotalInterest();
		}
		return total;
	}
	

}
