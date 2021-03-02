package turkishvendingmachine;

public class Products {
	
	
	private double cokonat = 1.75;
	private double ulkerCikolataliGofret = 2.0;
	private double canga = 2.0;
	private double su = 1.0;
	private double cocaCola = 3.5;
	private double fanta = 3.5;
	private double doritos = 5.99;
	private double nescafeExpress = 11.5;
	private double price;
	private int productNum;
	
	
	public double getCokonat() {
		return cokonat;
	}
	public double getUlkerCikolataliGofret() {
		return ulkerCikolataliGofret;
	}
	public double getCanga() {
		return canga;
	}
	public double getSu() {
		return su;
	}
	public double getCocaCola() {
		return cocaCola;
	}
	public double getFanta() {
		return fanta;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public double getDoritos() {
		return doritos;
	}
	public double getNescafeExpress() {
		return nescafeExpress;
	}
	@Override
	public String toString() {
		return "Urunler \n1.Cokonat = " + cokonat + " \n2.UlkerCikolataliGofret = " + ulkerCikolataliGofret + "\n3.Canga = " + canga
				+ "\n4.Su = " + su + "\n5.CocaCola = " + cocaCola + "\n6.Fanta = " + fanta + "\n7.Doritos = " + doritos + "\n8.NescafeExpress = " + 
				nescafeExpress;
	}
	
	
	
	
}
