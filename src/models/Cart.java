package models;

import java.util.List;


public class Cart {

	private int pno; 
	private String pName; 
	private double priceInEuro; 
	private double count; 
	private List<Description> shortDescription;
	private double totalPrice; 
	
	
	public Cart(int pno, String pName, double priceInEuro, List<Description> shortDescription) {
		this.pno = pno;
		this.pName = pName;
		this.priceInEuro = priceInEuro;
		this.count = 1.0;
		this.shortDescription = shortDescription;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPriceInEuro() {
		return priceInEuro;
	}
	public void setPriceInEuro(double priceInEuro) {
		this.priceInEuro = priceInEuro;
	}
	public double getCount() {
		return count;
	}
	
	public List<Description> getShortDescription() {
		return shortDescription;
	}
	public void setDescription(List<Description> shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public void updateCount() {
		this.count += 1.0; 
	}
	
	public void setTotalPrice(double price) {
		this.totalPrice += price; 
	}
	
	public double getTotalPrice() {
		return this.totalPrice; 
	}
	
}
