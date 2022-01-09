package Projektpckg;

import java.util.ArrayList;
import java.util.List;

public class Pants extends Product {

	List<Pants> spodnie=new ArrayList<>();
	
	private String cut;//kroj spodni np 7/8 
	private String material;
	private int size;
	private int numberProduct;
	
	
	public Pants(String brand, double price, String colour, String material , int size, String cut, int numberProduct) {
		super(brand, price, colour, numberProduct);
		this.material = material;
		this.size = size;
		this.cut = cut;
		this.numberProduct = numberProduct;
	}


	public Pants() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pants(String brand, double price, String colour, int numberProduct) {
		super(brand, price, colour, numberProduct);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "\nPants info:"+numberProduct+". brand:"+ brand + ", cut:" + cut + ", material:" + material + ", size:" + size +  ", colour:" + colour + ", price:" + getPrice() + "]";
	}
	
	
	//metody
	
	
		public void addPants(Pants e) {
			spodnie.add(e);
		}
		
		public void delete(Pants e, int i) {
			spodnie.remove(i);
			}
		
		//skonczyc
		public void search(Pants e) {
			if(spodnie.contains(e)) {
				System.out.println("The following elements match your search ");
				System.out.println(e.toString());
			}
		}
	
		//zrobic
		public void show() {
		
		}


		public String getCut() {
			return cut;
		}


		public void setCut(String cut) {
			this.cut = cut;
		}


		public String getMaterial() {
			return material;
		}


		public void setMaterial(String material) {
			this.material = material;
		}


		public int getSize() {
			return size;
		}


		public void setSize(int size) {
			this.size = size;
		}
		
		
		
		// gettery i settery
		
		
		
	
	
	
	
	
	
	
	
	
	
}
