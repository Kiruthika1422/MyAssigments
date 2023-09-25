package week1.day1;

public class SwitchBrowser {
	
	public static void main(String[] args) {
		
		String browser = "Chrome";
		
		switch(browser) {
		
		case "Firefox":
			System.out.println("Launch Firefox browser");
			break;
			
		case "Edge":
			System.out.println("Launch edge browser");
			break;
			
		case "Chrome":
			System.out.println("Launch Chrome browser");
			break;
			
		case "Safari":
			System.out.println("Launch Safari browser");
			break;
			
		default:
			System.out.println("Launch default browser");
			break;
			
		}
		System.out.println("This is for testing purpose");
	}

}
