package weekTwoAssignment;

public class weekTwoAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello" .charAt(0)== 'h');
		
		boolean isHotOutside = false;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
			System.out.println("Is Hot Outside: " + isHotOutside);
			System.out.println("Is a Weekday: " + isWeekday);
			System.out.println("Has Money in Pocket: " + hasMoneyInPocket);
		
		double costOfMilk = 2.5;
		double moneyInWallet = 8;
		int thirstLevel = 4; 
			System.out.println("Cost of Milk: " + costOfMilk);
			System.out.println("Amount of money in Wallet: " + moneyInWallet);
			System.out.println("Thirst level: " + thirstLevel);
		
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
			System.out.println("Should I buy Ice Cream: " + shouldBuyIceCream);
		
		boolean willGoSwimming = isHotOutside && isWeekday;
			System.out.println("Will go swiming: " + willGoSwimming);
			
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday;
			System.out.println("It is a good day: " + isAGoodDay);
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (costOfMilk *2));
			System.out.println("Will I buy milk: " + willBuyMilk);
	}

}
