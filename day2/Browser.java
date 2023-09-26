package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		// TODO Auto-generated method stub
		System.out.println("Browser launched successfully");
        return browserName;
	}
	public void loadUrl() {
		// TODO Auto-generated method stub
		System.out.println("Application url loaded successfully");

	}
	public static void main() {
		
		Browser test =new Browser();
		System.out.println(test.launchBrowser("chrome"));
		test.loadUrl();
		
		
	}
}
