package queuelist;
import java.util.ArrayList;
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

	//Sample 09: Override hashCode & equals
	@Override
	public int hashCode() {
		return Objects.hashCode(ProdId);
	}

	@Override
	public boolean equals(Object obj) {
		Product prod = (Product) obj;
		return (this.ProdId == prod.getProdId());
	}

}
