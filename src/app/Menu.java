package app;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList menuComponents = new ArrayList();
	String name;
	String permission;
	
	
	public Menu(String name, String permission) {
		super();
		this.name = name;
		this.permission = permission;
	}

	public ArrayList getMenuComponents() {
		return menuComponents;
	}

	public void setMenuComponents(ArrayList menuComponents) {
		this.menuComponents = menuComponents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		this.menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		this.menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return (MenuComponent)this.menuComponents.get(i);
	}
	
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(",  " + getPermission());
		
		Iterator iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			menuComponent.print();
		}
	}

}
