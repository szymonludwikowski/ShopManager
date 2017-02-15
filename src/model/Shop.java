package model;

import java.util.ArrayList;

public class Shop {

	private String shopsite;
	private ArrayList<Product> product;

	public String getShopsite() {
		return shopsite;
	}

	public void setShopsite(String shopsite) {
		this.shopsite = shopsite;
	}

	public ArrayList<Product> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}

}
