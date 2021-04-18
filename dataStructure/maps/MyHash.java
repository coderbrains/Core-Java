package dataStructure.maps;

import java.util.HashSet;
import java.util.Set;

class Pen{
	
	int price;
	String colour;
	
	public Pen(int price , String colour) {
		// TODO Auto-generated constructor stub
		this.colour = colour;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
}

public class MyHash {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pen pen1 = new Pen(10 , "blue");
		Pen pen2 = new Pen(10 , "blue");
		
		Set<Pen> pens = new HashSet<Pen>();
		
		pens.add(pen1);
		pens.add(pen2);
		
		System.out.println(pens);
		
		System.out.println(pen1.equals(pen2));
		
		

	}
	
	

}
