package Projektpckg;

import java.util.ArrayList;
import java.util.List;

public class ProductOperations {

	List<Product> produkty=new ArrayList<>();
	
	public void addNormal(Product f) {
		produkty.add(f);
}
	public void delete(int i) {
		produkty.remove(i);
	}
	
	
	
	
	public void showAll() {
		for( Product f:produkty) {
			System.out.println(f.toString());
		}
	}
	
	// metoda show dla produktow
	public void showShoe(){
		
		for( Product f:produkty) {
			if(f instanceof Shoe)
			{
			    System.out.println(f.toString());
			}
			}
		
	}
	
	public void showShirt(){
		for( Product f:produkty) {
			if(f instanceof Shirt)
			{
			    System.out.println(f.toString());
			}
			}
	}
	
	public void showPants(){
		for( Product f:produkty) {
			if(f instanceof Pants)
			{
			    System.out.println(f.toString());
			}
			}
}

	
}
