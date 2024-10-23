package tournament;

import java.util.*;
//complete this class -2.5 pts
public class Participant implements Comparable<Participant>{ //your code
    private String name;
    private int age;
    private String house;

    public Participant(String name, int age, String house) {
        this.name = name;
        this.age = age;
        this.house = house;
    }

   
  //your code
    @Override
	public int compareTo(Participant other) {
		// TODO Auto-generated method stub
    	if(this.age == other.age) {
    		return (this.name.toLowerCase()).compareTo(other.name.toLowerCase());
    	}else if(this.age > other.age) {
    		return 1;
    	}else {
    		return -1;
    	}
	}

  //your code
   @Override
   public boolean equals(Object o) {
	   return compareTo((Participant) o) == 0;
   }
    
  //your code
  @Override
  public int hashCode() {
	  return name.hashCode()+ age;
  }
  //your code
  @Override
  public String toString() {
	  return "Participant{name='"+name+"', age="+age+", house='"+house+"'}";
  }

}
