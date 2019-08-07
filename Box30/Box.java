package Box30;

public class Box {
	double length;
	double width;
	double height;
	double volume;  
  
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.volume = length * width * height;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if(this.volume != other.volume) 
			return false;
		return true;
	}  
}
