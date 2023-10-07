package week2.day4;

public class Desktop extends Computer{

	private void desktopSize() {
		System.out.println("This is Desktop size");
	}
	public static void main(String[] args) {
		Desktop desc = new Desktop();
		desc.desktopSize();
		desc.computerModel();
		
	}

}
