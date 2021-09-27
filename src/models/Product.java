package models;

public class Product {
	
	private int pno; 
	private String pName; 
	private double priceInEuro; 
	private String imageFile; 
	
	
	public Product(int pno, String pName, double priceInEuro, String imageFile) {
		this.pno = pno; 
		this.pName = pName; 
		this.priceInEuro = priceInEuro; 
		this.imageFile = imageFile; 
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


	public String getImageFile() {
		return imageFile;
	}


	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	
	

}
