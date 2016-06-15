import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Room [] rooms = new Room[10];

		Room r0 = new TreasureRoom ("Living Room", "There is a shag carpet here.", "remote control", 5);
		MonsterRoom r1 = new MonsterRoom ("Orc Den", "There is a smelly pile of bones of past adventurers", "Jim the Orc", Integer.MAX_VALUE);
		TreasureRoom r2 = new TreasureRoom ("Room of Requirement", "There's an amazing pile of junk here.", "Diadem of Rowena Ravenclaw", 1000);
		TrapRoom r3 = new TrapRoom ("Whirling Scythes Room", "There are a pair of scythes swinging back and forth through the room.", "Do you want to JAM them or CRAWL?", "CRAWL");

		rooms[0] = r0;
		rooms[1] = r1;//monster room
		rooms[2] = r2;//treasure room
		rooms[3] = r3;//trap room
		
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
