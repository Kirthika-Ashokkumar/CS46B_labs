package tournament;

import java.io.*;
import java.util.*;

public class TournamentManager {
    private static ArrayList<Champion> champions = new ArrayList<>();

    public static void main(String[] args) {
    	//update the file path of file name if yours is different
    	/*
		On windows:
		The directory separator in file paths is backslashes (\).
		The current directory can be written as.\.
		For example,.\file.txt refers to a file called file.txt in the current directory.
		
		On macOS (unix-like systems):
		The directory separator for file paths is forward slashes (/).
		The current directory can be denoted as./.
		For example,./file.txt refers to a file called file.txt in the current directory.
    	 */
    	String dirPath = "./src/tournament";
    	String fileName = "champs.txt";
        try {
            // Read champion data from file
            readChampionData(dirPath, fileName);

            // Perform binary search for a champion
            Champion searchResult = searchChampion(350);
            if (searchResult != null) {
                System.out.println("Found champion: " + searchResult.getName());
            } else {
                System.out.println("Champion not found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readChampionData(String dirPath , String filename) /*your code here*/ {
    	
    	//your code here
    	
 
    }

    public static Champion searchChampion(int totalScore) {
    	//your code here
    }
    //recursive binary search
    private static Champion binarySearch(int totalScore, int left, int right) {
    	
        //your code here

	public static ArrayList<Champion> getSortedChampions() {
		Collections.sort(champions);
		return champions;
	}
}

