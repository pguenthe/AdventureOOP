
public class MonsterRoom extends Room {
	private String name;
	private int difficulty;
	
	public MonsterRoom (String title, String description, 
			String name, int difficulty) {
		//call the super constructor
		//can only be called from a subclass constructor
		//AND only as the first line in the subclass constructor
		super(title, description);
		this.name = name;
		this.difficulty = difficulty;
	}
	
	public String getName() {
		return name;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	@Override
	//this is a straight-up override, Room's challenge() is ignored
	public void challenge () {
		System.out.println("You died.");
	}
	
	public void disposeOfCorpse() {
		System.out.println("Corpse left in pile.");
	}
}
