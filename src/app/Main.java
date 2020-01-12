package app;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuComponent aEmployee = new Menu("A", "Admin");
		MenuComponent allMenu = new Menu("ALL MENUS", "PERMISSION");
		allMenu.add(aEmployee);
		aEmployee.add(new MenuItem("74/70 Bangkok", "Play games"));
		
		Waitress waitress = new Waitress(allMenu);
		waitress.printMenu();
	}

}
