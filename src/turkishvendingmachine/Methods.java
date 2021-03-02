package turkishvendingmachine;

import java.util.Scanner;

public class Methods {
	
	public double money(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac lira yatirmak istersiniz?");
		double money = scan.nextDouble();
		return money;
	}
	public double select(Products product) {
		
		System.out.println(product.toString());
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Lutfen secmek istediginiz urun numarasini giriniz(1'den 8'e kadar");
			System.out.println("Lutfen cikmak icin 0'i tuslayiniz");
			product.setProductNum(scan.nextInt());
			if(product.getProductNum()<0 || product.getProductNum()>8) {
				System.out.println("Yanlis giris yaptiniz Lutfen tekrar deneyiniz");
			}
			
		}while(product.getProductNum()<0 || product.getProductNum()>8);
		
		switch(product.getProductNum()) {
		case 0:
			System.out.println("Tesekkur eder yine bekleriz...");
			break;
		case 1:
			product.setPrice(product.getCokonat());
			break;
		case 2:
			product.setPrice(product.getUlkerCikolataliGofret());
			break;
		case 3:
			product.setPrice(product.getCanga());
			break;
		case 4:
			product.setPrice(product.getSu());
			break;
		case 5:
			product.setPrice(product.getCocaCola());
			break;
		case 6:
			product.setPrice(product.getFanta());
			break;
		case 7:
			product.setPrice(product.getDoritos());
			break;
		case 8:
			product.setPrice(product.getNescafeExpress());
			break;
		}		
		return product.getPrice();
	}
	
	public double balance(double price, double money, Products product) {
		while(price>money) {
			
			Scanner scan = new Scanner(System.in);
			 System.out.println("Almak istediginiz urun icin mevcut bakiyeniz yetersizdir para eklemek ister misiniz (Y/N)");
			 
			 char onay = scan.next().toUpperCase().charAt(0);
			 
			 if(onay == 'N') {
				 
				 System.out.println("Bakiyeniz " + money);
				 System.out.println("Tesekkur eder yine bekleriz...");
				 break;
			 }else if(onay == 'Y'){
				 
				 System.out.println("Ne kadar eklemek istersiniz?");
				  double eklenecek = scan.nextDouble();
				  money = money + eklenecek;
				  System.out.println("Yeni bakiyeniz " + money);
				  price = select(product);
			 }else {
				 System.out.println("Yanlis giris yaptiniz LUTFEN 'Y' veya 'N' GIRINIZ");
			 }
		}
		return money;
	}
	public void purchase(double price, double money, Products product) {
		
			while(money>=product.getPrice()) {
				
				money = money - product.getPrice();
				System.out.println("Yeni bakiyeniz " + money + " tl'dir");
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Alisverise devam etmek ister misiniz? (Y/N) giriniz");
				char onay = scan.next().toUpperCase().charAt(0);
				
				if(onay == 'N') {
					System.out.println();
					System.out.println("Tesekkur eder yine bekleriz...");
					break;
				}else if(onay == 'Y') {
					product.setPrice(select(product));
					money = balance(product.getPrice(), money, product);
				}else {
					System.out.println("Hatali giris yaptiniz LUTFEN 'Y' veya 'N' GIRINIZ");
				}
				
			}
	}

}
