package app;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	public void printMenu() {
		this.allMenus.print();
	}
}
