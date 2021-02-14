package hashset;

import java.util.Objects;

public class Product {
	private int ProdId;
	private String ProdName;
 
	// 1.1: Ctor
	Product(int id, String name) {
		ProdId = id;
		ProdName = name;
	}
 
	// 1.2: toString Override
	@Override
	public String toString() {
		return ProdId + ":" + ProdName ;
	}
	
	//1.3 Getter and Setter
	public int getProdId() {
		return ProdId;
	}
 
	public void setProdId(int prodId) {
		ProdId = prodId;
	}
 
	public String getProdName() {
		return ProdName;
	}
 
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
 
	//Sample 02: Modify HashCode and Equals to print hash code
	@Override
	public int hashCode() {
		int x = Objects.hashCode(ProdId);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Collection Called our hashCode");
		System.out.println("Hash code for " + this.ProdName +
    " is : " + x);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		return x;
	}
	
  @Override
  public boolean equals(Object obj) {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Collection Called our equals method");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    Product prod = (Product) obj;
    return (this.ProdId == prod.getProdId());
  }
}
