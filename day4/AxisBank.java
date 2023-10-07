package week2.day4;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		System.out.println("This is deposit Account from Axsis bank");
		super.deposit();
	}
	
	public static void main(String[] args) {

		AxisBank ab = new AxisBank();
		ab.deposit();
	}

}
