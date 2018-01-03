package practice.hackerearth;

public class Order {

	String source;
	int souceref;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + souceref;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
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
		Order other = (Order) obj;
		if (souceref != other.souceref)
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}
	

}
