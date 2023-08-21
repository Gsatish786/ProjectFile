package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

// This class manages songs of users
public class FinalList2 {

	public static void main(String[] args) {
		// This map stores song lists of each user
		HashMap<String, Deque<String>> userSongs = new HashMap<>();

		// Define a list of valid users
		ArrayList<String> userlist = new ArrayList<String>();
		userlist.add("U1");
		userlist.add("U2");

		// Instantiate a Scanner object for console input
		Scanner scn = new Scanner(System.in); 

		// Loop to get valid username and update the song list
		for (int i = 0; i < 3; i++) {
			String username = null;
			for(int j=0;j<=j+1;j++) {
				System.out.println("Enter username :");
				username = scn.next();
				if(userlist.contains(username)) {    
					break;
				}
				else {
					System.out.println("Enter valid username");
					continue;
				}
			}

			// Initialize a Deque using the ArrayDeque class to store songs
			Deque<String> S1 = new ArrayDeque<>(); // Moved this line here

			// Add initial elements to the Deque S1.
			S1.add("S1"); // Adds initial songs.
			S1.add("S2"); 
			S1.add("S3"); 

			System.out.println(S1); // Prints the initial Deque S1.

			// Add the Deque to the HashMap
			userSongs.put(username, S1);




			// Loops until the Deque size is more than 3.
			for(int a=0; S1.size() <= 3; a++) {
				// If Deque size is 3, remove the first element and continue to next iteration.
				if(S1.size() == 3) {
					S1.poll();
					continue;
				}


				// This is list of valid songs inputs
				ArrayList<String> tlist = new ArrayList<String>();
				tlist.add("S1");
				tlist.add("S2");
				tlist.add("S3");
				tlist.add("S4");
				tlist.add("S5");
				tlist.add("S6");

				String t = null;
				// Loop to get valid songs
				for(int j=0;j<=j+1;j++) {

					// Asks for user input for a song and adds it to the Deque.
					System.out.println("Enter SONG :");
					t = scn.next();

					if(tlist.contains(t)) {
						break;
					}
					else
						System.out.println("Enter valid song");
					continue;
				}

				//This loop to avoid same songs repeat
				if (!S1.contains(t)) {
					S1.add(t);
					System.out.println( username+"'s songs: " + S1);
				} 
				else {
					System.out.println("This song is already in the list. Please enter a different song.");
					continue;
				}


			}
		}

		scn.close();

	}

}
