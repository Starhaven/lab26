 

public class Skeleton implements Monster
{
	private int size;
	private String name;
	
	public Skeleton(String getName, int getSize){
		name = getName;
		size = getSize;
	}

	public int getHowBig() {
		return size;
	}

	public String getName() {
		return name;
	}

	public boolean isBigger(Monster other) {
		return this.getHowBig()>other.getHowBig();
	}

	public boolean isSmaller(Monster other) {
		return this.getHowBig()<other.getHowBig();
	}

	public boolean namesTheSame(Monster other) {
		return this.getName().equals(other.getName());
	}
}