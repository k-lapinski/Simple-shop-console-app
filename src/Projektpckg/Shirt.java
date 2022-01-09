package Projektpckg;

import java.util.ArrayList;
import java.util.List;

public class Shirt extends Product {
List<Shirt> koszulki=new ArrayList<>();
	
	private String material;
	private String size;
	private int numberProduct;
	
	
	public Shirt(String brand, double price, String colour, String material , String size, int numberProduct) {
		super(brand, price, colour, numberProduct);
		this.material = material;
		this.size = size;
		this.numberProduct = numberProduct;
	}
	
	
	public Shirt() {
		}
	
	public Shirt(String brand, double price, String colour,int numberProduct) {
		super(brand, price, colour, numberProduct);
		
	}
	
	@Override
	public String toString() {
		return "\nShirt info:"+numberProduct+".  brand:" + brand + ", size:" + size + ", material:" + material
				+ ", colour:" + colour + ", price:" + getPrice();
	}
	
	
	
	
	
	//metody
	
	
	public void addShirt(Shirt e) {
		koszulki.add(e);
	}
	
	public void delete(Shirt e, int i) {
		koszulki.remove(i);
		}

	public boolean search(Shirt e) {
		if(koszulki.contains(e))
		{
			System.out.println("The following elements match your search ");
			System.out.println(e.toString());
		return true;
		}
		else 
			return false;
	}

	
	
	
	
	
	
	
	
	
	
	//gettery i settery 
	
	


	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
