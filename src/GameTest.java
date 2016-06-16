import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Room [] rooms = new Room[10];//creating an array of rooms (null)
		//not instantiating actual Rooms here

		//datatype varname = new datatype (info);
		//can always use a more specific type where a more general is expected
		//{class} varname = new {subclass} (info); //legit
		//Room r0 = new TreasureRoom ("Living Room", "There is a shag carpet here.", "remote control", 5);
		
		//not legit: {subclass} varname = new {superclass}...
		//the superclass doesn't have e/t expected in the subclass
		//TreasureRoom t = new Room ("This won't", "work!");

		rooms[0] = new TreasureRoom ("Living Room", "There is a shag carpet here.", "remote control", 5);
		rooms[1] = new MonsterRoom ("Orc Den", "There is a smelly pile of bones of past adventurers", "Jim the Orc", Integer.MAX_VALUE);
		rooms[2] = new TreasureRoom ("Room of Requirement", "There's an amazing pile of junk here.", "Diadem of Rowena Ravenclaw", 1000);
		rooms[3] = new TrapRoom ("Whirling Scythes Room", "There are a pair of scythes swinging back and forth through the room.", "Do you want to JAM them or CRAWL?", "CRAWL");
		
		//abstract classes cannot be instantiated
		//Room r0 = new Room("This can't", "be concrete");//no good
		//this is OK--not instantiating Room, just making a Room variable
		//Room r1 = new MonsterRoom("uh", "uh", "uh", 1);
		
		for (Room r: rooms) {
			if (r == null) {
				System.out.println("End of dungeon. Game Over.  (Yeah, you won)");
				break;
			}
			r.display();
			//what's going to happen? r[0] is a Room, r[1] is a MonsterRoom
			//they have different challenge() methods
			r.challenge();
		
			if (r instanceof MonsterRoom) {
				((MonsterRoom)r).disposeOfCorpse();
			}
				
			System.out.print("Press Enter to continue");
			scan.nextLine();
		}
		scan.close();
	}
}
