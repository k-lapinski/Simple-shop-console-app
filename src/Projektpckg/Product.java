package Projektpckg;

public class Product {
String brand;
private double price;
String colour;
int numberProduct;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}


public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}


public Product() {
	}

public Product(String brand, double price, String colour, int numberProduct) {
	this.brand = brand;
	this.price = price;
	this.colour = colour;
	this.numberProduct = numberProduct;
}
@Override
public String toString() {
	return "Product: "+numberProduct+". [brand=" + brand + ", size=" + price + ", colour=" + colour + "]";
}

}
