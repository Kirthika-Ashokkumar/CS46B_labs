package stacklab;

import java.io.*;
import java.util.Stack;


public class Lister {
	
	private File file;
	private boolean showHidden;
	
	public Lister(File f, boolean showH) {
		file = f;
		showHidden = showH;
	}
	
	public void list() {
//		listFilesRecurse(file);
		listFilesStack(file);
	}
    
	private void listFilesRecurse(File f) {
		//check if the file is directory 
		if(f.isDirectory()) {
			//creates a array of the files in directory
			File[] files = f.listFiles();
			//loops through the files and looks for more directories 
			for(File file:files) {
				//recurse each file
				listFilesRecurse(file);	
			}
		}
		else {
			//checks id file is not hidden and prints each file if the showHidden is true
			//prints out non hiddenfiles
			if(showHidden || !f.isHidden()) {
				//base case the root file 
				System.out.println(f.getName());
			}
		}
			
	}
    
    //fill this in
    private void listFilesStack(File f) {
    	Stack<File> fileStack =  new Stack<File>();
    	fileStack.push(f);
    	while(!fileStack.isEmpty()) {
    		File temp = fileStack.pop();
    		if(!temp.isDirectory()) {
    			if(showHidden || !f.isHidden()) {
    				System.out.println(temp.getName());
    			}
    		}
    		else{
    			File[] files = temp.listFiles();
    			for(int i = files.length-1; i > -1;i--) {
    				fileStack.push(files[i]);
    			}
    		}
			
    	}
        
    }
	
	public static void main(String[] args) {
        //replace with a directory of your own
        String directory = "/Users/kirthika/eclipse-workspace/Lab1";
		File dir = new File(directory);
		Lister l = new Lister(dir,true);
		l.list();
	}

}
