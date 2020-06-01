//POJO
public class Hero {
	//attributes or fields
	//private access modifer, encapsulates my data
	//uses camelCase
	
	private String name;
	private String specialMove;
	private int healthLevel;
	private boolean isAlive;
	
	//constructor
	//no args constructor, no arguments
	public Hero() {
		
	}
	
	public Hero(String name, String specialMove) {
		//calls the parent constructor
		super();
		this.name = name;
		this.specialMove = specialMove;
	}
	
	public Hero(String name, String specialMove, int healthLevel, boolean isAlive) {
		//used in constructor chaining
		//using the "this" keyword calls in a constructor of the same class type
		//this is method overloading, compile time polymorphism
		this(name, specialMove);
		this.healthLevel = healthLevel;
		this.isAlive = isAlive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialMove() {
		return specialMove;
	}

	public void setSpecialMove(String specialMove) {
		this.specialMove = specialMove;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void setHealthLevel(int healthLevel) {
		this.healthLevel = healthLevel;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
