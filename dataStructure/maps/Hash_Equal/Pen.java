package dataStructure.maps.Hash_Equal;

public class Pen {
	
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
	
//	@Override
//	public boolean equals(Object object) {
//		
//		Pen pen = (Pen)object;
//		
//		if(this.price == pen.price && this.colour.equals(pen.colour)) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//	@Override
//	public int hashCode() {
//		return price + colour.hashCode(); 
//		
//		
//	}
	
	

}
