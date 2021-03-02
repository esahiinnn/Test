package turkishvendingmachine;

public class Runner {

	public static void main(String[] args) {

		Products product = new Products();
		Methods methods = new Methods();
		
		System.out.println("Merhaba, alisverise hosgeldiniz");
		
		double money = methods.money();
		System.out.println("Para yatirma islemi basariyla gerceklesti Hesabinizda " + money + " tl mevcuttur");
		product.setPrice(methods.select(product));
		money = methods.balance(product.getPrice(), money, product);
		methods.purchase(product.getPrice(), money, product);
		

	}

}
