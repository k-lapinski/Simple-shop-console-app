package Projektpckg;

import java.util.ArrayList;
import java.util.List;

public class Client {
String name;
String password;
String adress;
int numberClient;
private Client copyNew;

	public Client(Client copy) {
		//this(copy.name,copy.password,copy.adress,copy.koszyk,copy.numberClient);
		this.name = copy.name;
		this.password = copy.password;
		this.adress = copy.adress;
		this.koszyk = copy.koszyk;
		this.numberClient = copy.numberClient;
	}


List<Product> koszyk=new ArrayList<>();
List<Client> klienci=new ArrayList<>();

public void addClient(Client e) {
	klienci.add(e);
}

public void deleteClient(int i) {
	System.out.println("Type the index of client you want to delete");
	klienci.remove(i);
}

public void showClient() {
	for(Client f: klienci) {
		System.out.println(f.toString());
	}
}

public Client() {
	}


public Client(String name, String password, String adress, List<Product> koszyk, int numberClient) {
	this.name = name;
	this.password = password;
	this.adress = adress;
	this.koszyk = koszyk;
	this.numberClient = numberClient;
}

@Override
public String toString() {
	return "\n\nClient:"+ numberClient+".  name=" + name + ", password= ******* " /*+ password*/+ ", adress=" + adress + "\n" +"your cart contains:" + koszyk.toString();
}




//gettery i settery 


}
