import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Room [] rooms = new Room[10];

		//instantiating a room
		Room r0 = new Room ("Living Room", "There is a shag carpet here.");

		//instatiating a MonsterRoom
		MonsterRoom r1 = new MonsterRoom ("Orc Den", "There is a smelly pile of bones of past adventurers", "Jim the Orc", Integer.MAX_VALUE);

		TreasureRoom r2 = new TreasureRoom ("Room of Requirement", "There's an amazing pile of junk here.", "Diadem of Rowena Ravenclaw", 1000);
		
		rooms[0] = r0;
		rooms[1] = r1;
		rooms[2] = r2;
		
		for (Room r: rooms) {
			if (r == null) {
				System.out.println("End of dungeon. Game Over.  (Yeah, you won)");
				break;
			}
			r.display();
			//what's going to happen? r[0] is a Room, r[1] is a MonsterRoom
			//they have different challenge() methods
			r.challenge();
			
			System.out.print("Press Enter to continue");
			scan.nextLine();
		}
		scan.close();
	}

}
