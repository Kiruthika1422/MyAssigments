package week2.day4;

public class Students {

	public int getStudentInfo(int id) {
		return id;
		
	}
	public String getStudentInfo(int id, String name) {
		return name;

	}
	public long getStudentInfo(String email,long phone) {
		return phone;

	}
	
	public static void main(String[] args) {
		Students ml = new Students();
		System.out.println("Id is"+" "+ml.getStudentInfo(123));
		System.out.println("Name is"+" "+ml.getStudentInfo(123, "Kiruthika"));
		System.out.println("Phone num is"+" "+ml.getStudentInfo("abc@gmail.com", 470643506));

	}

}
