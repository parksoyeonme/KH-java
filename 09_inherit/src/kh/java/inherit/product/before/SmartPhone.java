package kh.java.inherit.product.before;

public class SmartPhone {

	private String brand;
	private String productName;
	private int price;
	
	private String os;
	
	private String carrier; //통신사
	
	public SmartPhone() {}

	public SmartPhone(String brand, String productName, int price, String os, String carrier) {
		//super(); ->없어도 자동으로 호출되서 지워도된다. 알트 쉬프느 s 해서 ~~ 어쩌고 using field
		this.brand = brand;
		this.productName = productName;
		this.price = price;
		this.os = os;
		this.carrier = carrier;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public String getSmartPhoneInfo() {
		return brand + "," + productName + "," + price + "," +
				os + "," + carrier;
	}
	
}
