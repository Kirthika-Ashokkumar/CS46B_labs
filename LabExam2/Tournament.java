package tournament;
import java.util.*;
//complete the main method in this class - 2 pts
public class Tournament {

	public static void main(String[] args) {


		Participant p1 = new Participant ("Hermione Granger" , 19, "Gryffindor");
		Participant p2 = new Participant ("Draco Malfoy" , 19, "Slytherin");
		Participant p3 = new Participant ("Cedric Diggor" , 21, "Hufflepuff");
		Participant p4 = new Participant ("Cho Chang" , 18, "Ravenclaw");
		Participant p5 = new Participant ("harry potter" , 19, "Gryffindor");
		Participant p6 = new Participant ("Harry Potter" , 19, "Gryffindor");
		
		
		StackLinkedList<Participant> pStack = new StackLinkedList<Participant>();
		pStack.push(p1);
		pStack.push(p2);
		pStack.push(p3);
		pStack.push(p4);
		pStack.push(p5);
		pStack.push(p6);
		
		
		ArrayList<String> challenges = new ArrayList<String>();
		challenges.add("Dragon");
		challenges.add("Lake");
		challenges.add("Maze");
		
		System.out.println("Here is the tournament schedule based on arbitrary order with access time complexity of O(1):");
		HashMap<Participant, String> tournamentSchedule = new HashMap<Participant, String>();
	    Random rndm = new Random();
		for (Object o : pStack)
		{
			Participant p = (Participant)o;
			String ch = challenges.get(rndm.nextInt(challenges.size()));
			tournamentSchedule.put(p, ch);
			System.out.println(p + " --> " + ch);
		}
		
		System.out.println("\nHere is the sorted tournament schedule based on participants' age and then name with access time complexity of O(log n):");
		//your code
		TreeMap<Participant, String> tournamentScheduleInOrder = new TreeMap<Participant, String>(tournamentSchedule);
		for(Participant p:tournamentScheduleInOrder.keySet()) {
			System.out.println(p + " --> " + tournamentScheduleInOrder.get(p));
		}
	}

}
