package app;

public class MenuItem extends MenuComponent {
	String address;
	String hobbie;
	
	public MenuItem(String address, String hobbie) {
		super();
		this.address = address;
		this.hobbie = hobbie;
	}
	public String getAdress() {
		return this.address;
	}
	public String getHobbie() {
		return this.hobbie;
	}
	public void print() {
		System.out.println("Address: " + getAdress());
		System.out.println("Hobbie: " + getHobbie());
	}
}
