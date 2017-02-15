package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Shop{

	private String shopsite;
	private ArrayList<Product> prodList;

	public void addProd(Product newproduct) {
		prodList.add(newproduct);
	}

	public void delProd(int idRemove) {
		Iterator<Product> iterator = prodList.iterator();
		while (iterator.hasNext()) {
			Product prod = iterator.next();
			if (prod.getId() == idRemove) {
				iterator.remove();
			}
		}
	}

	public void showList() {
		for (int i = 0; i < prodList.size(); i++) {
			System.out.println((i + 1) + " " + prodList.get(i).toString());
		}
	}

	public String getShopsite() {
		return shopsite;
	}

	public void setShopsite(String shopsite) {
		this.shopsite = shopsite;
	}

	public ArrayList<Product> getProduct() {
		return prodList;
	}

	public void setProduct(ArrayList<Product> product) {
		this.prodList = product;
	}

}
