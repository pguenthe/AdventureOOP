//class must be abstract because it has 1 or more abstract methods
public abstract class Room {
	private String title;
	private String description;
	
	public Room (String titl, String desc) {
		title = titl;
		description = desc;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void display() {
		System.out.println(title);
		System.out.println(description);
		System.out.println();
	}

	//method I don't need
	//by making an abstract method, I'm enforcing that subclasses MUST
	// implement this method--they actually have to write this method
	// with this exact signature
	public abstract void challenge();	
}
