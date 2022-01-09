package Projektpckg;
import java.util.ArrayList;
import java.util.List;



public class Shoe extends Product {
	List<Shoe> buty=new ArrayList<>();
	
	private int size;
	private String material;
	private boolean shoelace;
	private String Type;
	private int numberProduct;
	
	public Shoe(String brand,int size , double price, String colour, String material, String Type, boolean shoelace, int numberProduct) {
		super(brand, price, colour, numberProduct);
		this.material = material;
		this.Type = Type;
		this.shoelace = shoelace;
		this.size = size;
		this.numberProduct = numberProduct;
		
	}
	
	
	public Shoe() {
		}


	@Override
	public String toString() {
		return "\nShoe info:"+numberProduct+". brand:" + brand + ", shoelace:" + shoelace + ", Type:" + Type + ", material:" + material
				+ ", colour:" + colour + ", Size:" + size  + ", Price:" +getPrice() ;
	}



	public Shoe(String brand, double price, String colour, int numberProduct) {
		super(brand, price, colour, numberProduct);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	//metody
	
	
	
	
	public void addShoe(Shoe e) {
		buty.add(e);
	}
	
	public void delete(Shoe e, int i) {
		buty.remove(i);
		}
	public boolean search(Shoe e) {
		if(buty.contains(e)) {
			System.out.println("The following elements match your search ");
			System.out.println(e.toString());
			return true;
		}
		else 
			return false;
	}



	// gettery i settery 
	
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isShoelace() {
		return shoelace;
	}

	public void setShoelace(boolean shoelace) {
		this.shoelace = shoelace;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	
}