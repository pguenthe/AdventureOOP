
public class Room {
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
	
	public void challenge() {
		System.out.println("The room is empty. Have a nice day!");
	}
	
	
}
