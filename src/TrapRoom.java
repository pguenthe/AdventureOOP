import java.util.Scanner;

public class TrapRoom extends Room {
	private String question;
	private String answer;
	
	public TrapRoom (String title, String description, 
			String question, String answer) {
		//call the super constructor
		//can only be called from a subclass constructor
		//AND only as the first line in the subclass constructor
		super(title, description);
		this.question = question;
		this.answer = answer;
	}
	
	
	public String getQuestion() {
		return question;
	}


	public String getAnswer() {
		return answer;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}

	//extend: do e/t the super method does and more
	//which means I need to call the method from the superclass
	public void challenge () {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		String ans = scan.nextLine();
		if (answer.equalsIgnoreCase(ans)) {
			System.out.println("You live");
		} else {
			System.out.println("You die.");
		}
		scan.close();
	}
}
