
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test Scenario 1
		Card card1 = new Visa();
		Card card2 = new MasterCard();
		Card card3 = new Discover();
		Wallet w1 = new Wallet();
		Person p1 = new Person();
		w1.getCards().add(card1);
		w1.getCards().add(card2);
		w1.getCards().add(card3);
		p1.getWallets().add(w1);
		
		
		System.out.println("Card 1 interest: " + card1.getTotalInterest());
		System.out.println("Card 2 interest: " + card2.getTotalInterest());
		System.out.println("Card 3 interest: " +card3.getTotalInterest());
		System.out.println("Person 1 total owed: " +p1.getTotal());
		System.out.println("Person 1 interest owed: " + p1.getTotalInterest());


		//Test Scenario 2
		Card card11 = new Visa();
		Card card12 = new Discover();
		Wallet w11 = new Wallet();
		w11.getCards().add(card11);
		w11.getCards().add(card12);
		
		
		Card card13 = new MasterCard();
		Wallet w12 = new Wallet();
		w12.getCards().add(card13);
		
		Person p11 = new Person();
		
		p11.getWallets().add(w11);
		p11.getWallets().add(w12);
		
		System.out.println("Wallet 11 interest: "+ p11.getWallets().get(0).getWalletInterest());
		System.out.println("Wallet 12 interest: "+ p11.getWallets().get(1).getWalletInterest());
		System.out.println("Person 11's total owed: " + p11.getTotal());
		System.out.println("Person 11's interest owed: " + p11.getTotalInterest());
		
		
		
		//Test Scenario 3
		Card card111 = new Visa();
		Card card112 = new MasterCard();
		Card card113 = new Discover();
		Wallet w111 = new Wallet();
		Person p111 = new Person();
		w111.getCards().add(card111);
		w111.getCards().add(card112);
		w111.getCards().add(card113);
		p111.getWallets().add(w111);
				
		
		
		Card card114 = new Visa();
		Card card115 = new MasterCard();
		Wallet w112 = new Wallet();
		w112.getCards().add(card114);
		w112.getCards().add(card115);	
		Person p112 = new Person();
		p112.getWallets().add(w112);

				System.out.println("Wallet 111 interest: "+ p111.getWallets().get(0).getWalletInterest());
				System.out.println("Wallet 112 interest: "+ p112.getWallets().get(0).getWalletInterest());
				System.out.println("Person 111's total owed: " + p111.getTotal());
				System.out.println("Person 111's interest owed: " + p111.getTotalInterest());
				System.out.println("Person 112's total owed: " + p112.getTotal());
				System.out.println("Person 112's interest owed: " + p112.getTotalInterest());
		
		
		
	}

}
