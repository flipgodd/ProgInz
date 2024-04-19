package lv.venta.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
	private int id;
	private String title;
	private float price;
	private String description;
	private int quantity;
	private static int counter =0;
	public void setId () {
		id=counter;
		counter++;
	}
	public Product(String title, float price,String description,int quantity) {
		setId();
		setTitle(title);
		setPrice(price);
		setDescription(description);
		setQuantity(quantity);
		
	}
	

}
