//Name - kyle dodds
//Date - 2 February 2017
//Class - Period 5
//Lab  - 26

public class goblin implements Monster{
	private int size;
	private String name;
	
	public goblin(String getName, int getSize){
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