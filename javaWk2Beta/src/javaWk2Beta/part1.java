package javaWk2Beta;

public class part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 14;
		
		System.out.println(age >= 16);
		
		
		age = 16;
		System.out.println(age >= 16);
		
		boolean hasLicense = true; 
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive.");
		} else
			System.out.println("You cannot drive");
		
		double costOfMilk = 3.15;
		int thirstLevel = 6;
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		int numberOfCookies = 20;
		int numberOfChildren = 12;
		int remainingCookies = numberOfCookies % numberOfChildren;
		if (remainingCookies >=5 ){
			System.out.println("Jackpot");
		}else if (remainingCookies >=2 ){
			System.out.println("Woohoooo");
		}else if (remainingCookies > 0 ){
			System.out.println("Yes!");
		}else {
			System.out.println("Sad Face");
		}
		
		String loyaltyMemberStatus = "silver";
		double loyaltyMemberDiscount = 0.0;
		switch (loyaltyMemberStatus){
			case "silver":
				loyaltyMemberDiscount = 0.10;
				break;
			case "gold":
				loyaltyMemberDiscount = 0.15;
				break;
			case "platinum":
				loyaltyMemberDiscount = 0.25;
				break;
				
		}
		System.out.println(loyaltyMemberDiscount);
		double billTotal = 1332.23;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "silver") {
				loyaltyMemberStatus = "gold";
			}else if (loyaltyMemberStatus == "gold") {
				loyaltyMemberStatus = "platinum";
			}
		}
		System.out.println(loyaltyMemberStatus);
		
		String username = "Tommy123";
		String password = "12345";
		if (username.equals ("Tommy123") && password.equals ("12345")){
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		for (int i=0; i < 10; i++) {
			System.out.println(i);
		}
		for (int i=10; i >= 0; i--) {
			System.out.println(i);
		}
		for (int i=0; i <= 100; i+=2) {
			System.out.println(i);
		}
		for (int i=0; i <= 100; i++) {
			if (i % 2 ==0) {
			System.out.println(i + " even");
		} else  {
			System.out.println(i + " odd");
		}
		}
		int i = 100;
		while (i > 0) {
			System.out.println(i % 3);
			i--;
		}
	}

}
