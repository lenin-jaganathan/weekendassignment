package weekendassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Card  {
	
	String symbol;
	int value ;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Card(String symbol, int value) {
		super();
		this.symbol = symbol;
		this.value = value;
	}
	
	
	
}

public class CollectAndGroup {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number of cards:");
		int numberOfCards = sc.nextInt() ;
		Map<String, List<Card>> symbolCardMap = new HashMap<String, List<Card>>() ;
		for(int i=0;i<numberOfCards;i++) {
			System.out.println("Enter card "+i);
			String symbol = sc.next() ;
			int value = sc.nextInt() ;
			Card tempCard = new Card(symbol, value);
			List<Card> cardValue = symbolCardMap.getOrDefault(symbol, new ArrayList<Card>());
			cardValue.add(tempCard);
			symbolCardMap.put(symbol, cardValue);
		}
		System.out.println("Distinct symbols are");
		symbolCardMap.keySet().stream().sorted().forEach(symbol -> System.out.print(symbol+" "));
		System.out.println();
		symbolCardMap.keySet().stream()
							.sorted()
							.forEach(symbol -> {
								System.out.println(String.format("Cards in %s symbol are", symbol));
								symbolCardMap.get(symbol).stream()
											.forEach(card -> System.out.println(String.format("%s %d", card.getSymbol(), card.getValue())));
								System.out.println("Numeber of cards : "+symbolCardMap.get(symbol).size());
								System.out.println("Sum of numebers : "+symbolCardMap.get(symbol).stream().map(card -> card.getValue()).reduce(0, Integer::sum)
																					);
							});
		sc.close();					
		
	}
	
}
