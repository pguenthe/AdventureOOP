
public class TreasureRoom extends Room {
	private String name;
	private int value;
	
	public TreasureRoom (String title, String description, 
			String name, int value) {
		//call the super constructor
		//can only be called from a subclass constructor
		//AND only as the first line in the subclass constructor
		super(title, description);
		this.name = name;
		this.value = value;
	}
	
	
	public String getName() {
		return name;
	}


	public int getValue() {
		return value;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setValue(int value) {
		this.value = value;
	}

	//extend: do e/t the super method does and more
	//which means I need to call the method from the superclass
	public void challenge () {
		super.challenge();
		System.out.println("However, there is a " + name + " here worth " + value + " gold pieces");
		super.challenge();
	}
}
