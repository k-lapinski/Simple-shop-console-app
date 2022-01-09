package Projektpckg;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main implements Serializable {

	
	
		public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String fileNames;
		//magazyn
		int numberClient = 0;
		int numberProduct = 0;
		List <Product> All = new ArrayList<>();
		List<Order> orders=new ArrayList<>();
		Shirt newShirt = new Shirt("Levi's", 54, "black" , "cotton", "L", numberProduct++);
		Shirt newShirtTwo = new Shirt("Reserved", 49, "white" , "cotton", "XL", numberProduct++);
		Shirt newShirtThree = new Shirt("HM", 20, "red" , "cotton", "S", numberProduct++);


		
		

		Pants newPants = new Pants("Levi's", 23, "navy", "jeans", 28, "5/6", numberProduct++);
		Pants newPantsTwo = new Pants("Calvin Klein", 55, "black", "jeans", 32, "5/6", numberProduct++);
		Pants newPantsThree = new Pants("PULL&BEAR", 12, "blue", "Chino", 30, "5/6", numberProduct++);
		
		

		
		

		Shoe newShoe = new Shoe("Nike", 44, 55, "white", "leather", "sneakers", true, numberProduct++);
		Shoe newShoeTwo = new Shoe("Pier One", 44, 55, "brown", "leather", "slippers", true, numberProduct++);
		Shoe newShoeThree = new Shoe("Adidas", 44, 55, "black", "leather", "sneakers", true, numberProduct++);


		All.add(newShirt);
		All.add(newShirtTwo);
		All.add(newShirtThree);

		All.add(newPants);
		All.add(newPantsTwo);
		All.add(newPantsThree);

		All.add(newShoe);
		All.add(newShoeTwo);
		All.add(newShoeThree);

		
		//klienci z koszykami
		List<Client> klientela = new ArrayList<>();
		List <Product> basketTest = new ArrayList<>();
		Client clientTest = new Client("Zbyszek","****", "Warszawska 5 Kraków 00-002", basketTest, numberClient++);
		basketTest.add(All.get(3));
		basketTest.add(All.get(6));
		klientela.add(clientTest);
		List <Product> basketTestTwo = new ArrayList<>();
		Client clientTestTwo = new Client("Adrian","*****", "Kolataja 23/21 Bialystok 15-022", basketTestTwo, numberClient++);
		basketTestTwo.add(All.get(0));
		basketTestTwo.add(All.get(5));
		klientela.add(clientTestTwo);


///// menu z gotowymi opcjami
		
		int option;
		do {System.out.println("----------------------------" + "\n \tMenu:" +
				"\n 1 Add client\n 2 Delete client \n 3 Search client\n 4 View client\n 5 Create your own product" +
				"\n 6 Delete product \n 7 Show products\n 8 Read client file\n 9 Read products file \n 10 Save clients to file \n"
				+ " 11 Save products to file\n 12 Use basket of already existing client" + "\n 13 View orders"+
				"\n 0 end\n" + "----------------------------\n" + "Choice:");
			option = sc.nextInt();
			switch (option) {
				case 1:
					
					List <Product> basket = new ArrayList<>();
					System.out.println("Name:");
					String clientName = sc.next();
					sc.nextLine();
					System.out.println("Passowrd:");
					String clientPass = sc.next();
					sc.nextLine();
					System.out.println("Adress:");
					String clientAdress = sc.nextLine();
					Client client = new Client(clientName,clientPass, clientAdress, basket, numberClient++);
					klientela.add(client);
					System.out.println("1 Add products\n2 Return to main menu");
					int addProducts = sc.nextInt();
					if(addProducts==1) {
						int Productint;
						do {
						System.out.println("1 Add product ||||||  0 Go back");
						Productint = sc.nextInt();
						if(Productint==1) {
							System.out.println(All.toString());
							System.out.println("choose the product you want to add:");
							int Choice = sc.nextInt();
							try {
								basket.add(All.get(Choice));
							}catch(IndexOutOfBoundsException exception) {
								System.out.println("Wrong index");
							}
							
						}
						else {
							break;
						}
						} while(true);
					}
					else if(addProducts==2) {
						break;
					}
					else {
						System.out.println("wrong option");
						break;
					}
					System.out.println(client);
					break;
				case 2:

					System.out.println(klientela.toString());
					System.out.println("Enter the number of client:");
					try {
						int deleteClient = sc.nextInt();
						klientela.remove(deleteClient);
					}
					catch (Exception e) {
						System.out.println("This client not exist");
					}
					break;
				case 3:
					System.out.println("Enter the client name");
					String searchingName = sc.next();
					List<Client> result = new ArrayList<>();
					for (Client clients: klientela) {
						if(clients.name.equals(searchingName) ){
							result.add(clients);
							System.out.println(clients);
						}
					}
					break;
				case 4:

					System.out.println(klientela.toString());
					break;
				case 5:

					String createOption;
					do {
						System.out.println("1 Shirt\n2 Shoe\n3 Pants\nc Back");
						createOption = sc.next();
						switch (createOption) {
							case"1":
								System.out.println("brand:");
								clientName = sc.next();
								System.out.println("price:");
								int price = sc.nextInt();
								System.out.println("colour:");
								String clientColour = sc.next();
								System.out.println("material:");
								String material = sc.next();
								System.out.println("size:");
								String size = sc.next();
								Shirt newShirts = new Shirt(clientName, price, clientColour, material, size, numberProduct++);
								All.add(newShirts);
								for( Product f:All) {
									if(f instanceof Shirt)
									{
										System.out.println(f.toString());
									}
								}

								break;
							case"2":
								System.out.println("brand:");
								clientName = sc.next();
								System.out.println("size:");
								int sizePants = sc.nextInt();
								System.out.println("price:");
								price = sc.nextInt();
								System.out.println("colour:");
								clientColour = sc.next();
								System.out.println("material:");
								material = sc.next();
								System.out.println("type:");
								String cut = sc.next();
								System.out.println("shoelace?\n1 yes\n2 no");
								String shoelace = sc.next();
								boolean shoelaceTruOrNo;
								if(shoelace.equals("1")) {
									shoelaceTruOrNo = true;
								}
								else if(shoelace.equals("2")) {
									shoelaceTruOrNo = false;
								}
								else {
									System.out.println("Wrong option");
									break;
								}
								Shoe newShoes = new Shoe(clientName, sizePants, price , clientColour, material, cut, shoelaceTruOrNo, numberProduct++);
								All.add(newShoes);
								for( Product f:All) {
									if(f instanceof Shoe)
									{
										System.out.println(f.toString());
									}
								}
								break;
							case"3":
								System.out.println("brand:");
								clientName = sc.next();
								System.out.println("price:");
								price = sc.nextInt();
								System.out.println("colour:");
								clientColour = sc.next();
								System.out.println("material:");
								material = sc.next();
								System.out.println("size:");
								sizePants = sc.nextInt();
								System.out.println("cut:");
								cut = sc.next();
								Pants newPantsCreate = new Pants(clientName, price, clientColour, material, sizePants, cut, numberProduct++);
								All.add(newPantsCreate);
								for( Product f:All) {
									if(f instanceof Pants)
									{
										System.out.println(f.toString());
									}
								}
								break;
							default:
								System.out.println("Creation terminated ");
								break;
						}
					} while (!"c".equals(createOption));
					break;
					
					
				case 6:

					System.out.println(All.toString());
					System.out.println("\n Enter the number of element you want to delete");
					int dindex = sc.nextInt();

					try {
						All.remove(dindex);
					}catch(IndexOutOfBoundsException ex) {
						System.out.println("Wrong index");
					}catch(Exception e) {
						System.out.println("You did something wrong");
					}

				break;
				
				case 7:
					System.out.println(All.toString());
				break;
				
					//read client
				case 8:
					System.out.println("Enter the filename");
					fileNames = sc.next();
					try {
						FileInputStream fileIn = new FileInputStream(fileNames);
						ObjectInputStream objectIn = new ObjectInputStream(fileIn);
						Object obj = objectIn.readObject();
						System.out.println(obj);
						objectIn.close();

					} catch (Exception ex) {
						ex.printStackTrace();
			}
					break;
				//read prod
				case 9:
					System.out.println("Enter the filename");
					fileNames = sc.next();
					try {
						FileInputStream fileIn = new FileInputStream(fileNames);
						ObjectInputStream objectIn = new ObjectInputStream(fileIn);

						Object obj = objectIn.readObject();

						System.out.println(obj);
						objectIn.close();

					} catch (Exception ex) {
						ex.printStackTrace();

					}
					break;
				//write client
				case 10:
					try {
						System.out.println("Enter the filename");
						fileNames = sc.next();
						FileOutputStream fileOut = new FileOutputStream(fileNames);
						ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
						objectOut.writeObject(klientela.toString());
						objectOut.close();
						System.out.println("The Object  was succesfully written to a file");

					} catch (Exception ex) {
						ex.printStackTrace();
					}
					break;
				
				
				// write prod
				case 11:
					try {
						System.out.println("Enter the filename");
						fileNames = sc.next();
						FileOutputStream fileOut = new FileOutputStream(fileNames);
						ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
						objectOut.writeObject(All.toString());
						objectOut.close();
						System.out.println("The Object  was succesfully written to a file");

					} catch (Exception ex) {
						ex.printStackTrace();
					}
					break;
				

				case 12:
					System.out.println(klientela.toString());
					System.out.println("\nEnter the number of client ");
					int newName = sc.nextInt();
					System.out.println("Do you want to 1. remove or  2. add product? / 3. order");
					String numberName = sc.next();
					if(numberName.equals("1")) {
						for (Client clients: klientela) {
							if(clients.numberClient == newName ){
								System.out.println(clients.koszyk);
								System.out.println("Enter the index of product");
								int indexNew= 0;
								try {
									indexNew = sc.nextInt();
								}
								catch (Exception exception) {
									System.out.println("wrong type");
								}
								clients.koszyk.remove(indexNew);
								System.out.println(clients);
							}
						}
					}
					else if(numberName.equals("2")) {
						for (Client clients: klientela) {
							if(clients.numberClient == newName ){
								System.out.println(All.toString());
								System.out.println("Enter the index of product");
								int indexProd= 0;
								try {
									indexProd = sc.nextInt();
								}
								catch (Exception exception) {
									System.out.println("wrong type");
								}

								clients.koszyk.add(All.get(indexProd));//
								System.out.println(clients);
							}
						}
					}
					else if(numberName.equals("3")){
						for (Client clients: klientela) {
							if(clients.numberClient == newName ){
								try {
									LocalDateTime myDateObj = LocalDateTime.now();
									DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
									String formattedDate = myDateObj.format(myFormatObj);
									 Client c = new Client(clients);
									Order o = new Order(c,formattedDate);
									orders.add(o);

									System.out.println("_____________________________________________________________________");
									System.out.println(o.toString());
									clients.koszyk.removeAll(clients.koszyk);
									System.out.println(clients);

								}
								catch (Exception e) {
									System.out.println("Error");
								}
							}
						}
					}
					else {
						System.out.println("Wrong number or type");
					}

				break;
				case 13:
					System.out.println(orders.toString());
				break;
				
				case 0:
					//wyjscie
					System.out.println("end...");
					break;
				default:
					System.out.println("wrong option "+option);
					break;
			}
		}
		while (0!=option);
		sc.close();
}


}
