package com.class16;

public class Phone {

	String brand,color,shape,model;
	int screen,camera,price;
	boolean potraitPicture;
	public static void main(String []args) {
		Phone phone1= new Phone();
		phone1.brand="iPhone";
		phone1.color="Space Gray";
		phone1.shape="Rectangle";
		phone1.model="x10";
		phone1.price= 1099;
		phone1.potraitPicture=true;
		
	//behavior
		
		phone1.takePhotos();
		phone1.playGames();
		phone1.playMusic();
		
		
		Phone phone2= new Phone();
		phone2.brand="Android";
		phone2.model="Samsung Galaxy S10";
		phone2.color="Prism Blue";
		phone2.shape="Rectangle";
		phone2.price= 899;
		phone2.potraitPicture=true;
		
		
		phone2.takePhotos();
		phone2.playGames();
		phone2.playMusic();
		
		
		Phone phone3= new Phone();
		phone3.brand="Nokia";
		phone3.model="Nokia 9";
		phone3.color="Black";
		phone3.shape="Rectangle";
		phone3.price= 799;
		phone3.potraitPicture=false;
		
		
		phone3.takePhotos();
		phone3.playGames();
		phone3.playMusic();
	}

void takePhotos() {
	System.out.println("We can take photos with "+brand+" "+model);
}
void playGames() {
	System.out.println("We can play games on "+brand+" "+model);
}
void playMusic() {
	System.out.println("We can play music on "+brand+ " "+model);
}
}