package menu;

import java.math.BigDecimal;
import java.util.Scanner;

import model.Product;
import model.Rims;
import model.Shop;

public class Menu {
	public void runApp() {

		Scanner scaner = new Scanner(System.in);
		String option;
		Shop shop = null;

		System.out.println("1 - Add Rims");
		System.out.println("2 - Remove product");
		System.out.println("3 - Show list");
		System.out.println("4 - FAQ");
		System.out.println("q - wyjœcie z programu");

		do {
			System.out.print("Choose option: ");
			option = scaner.nextLine();

			switch (option) {
			case "1":

				System.out.print("Product name: ");
				String name = scaner.nextLine();
				System.out.print("Product price: ");
				BigDecimal price = scaner.nextBigDecimal();
				scaner.nextLine();
				System.out.print("Inches: ");
				String inch = scaner.nextLine();
				Product newProduct = new Rims(name, price, inch);
				shop.addProd(newProduct);
				break;
				
			case "2":
				
				shop.showList();
				System.out.print("Give ID to delete: ");
				int id = scaner.nextInt();
				scaner.nextLine();
				shop.delProd(id);
				break;

			case "3":
				
				System.out.println("Product list: ");
				shop.showList();
				
			case "4":
				
				System.out.println("");
			}
		} while (!option.equals("q"));

	}
}
