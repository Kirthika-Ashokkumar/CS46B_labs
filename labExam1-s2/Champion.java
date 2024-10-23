package tournament;

public class Champion implements Comparable<Champion>{
	private String name;
	private String school;
	private int totalScore;
	
	public Champion(String name, String school, int totalScore) {
		this.name = name;
		this.school = school;
		this.totalScore = totalScore;
	}
	public String getName() {
		return name;
	}
	
	public String getSchool() {
		return school;
	}
	
	public int getTotalScore() {
		return totalScore;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	
	@Override
	public int compareTo(Champion o) {
		if(totalScore == o.totalScore) {
			return 0;
		}else if(totalScore <  o.totalScore) {
			return -1;
		}else {
			return 1;
		}
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return compareTo((Champion) obj)==0;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode()+ school.hashCode()+ totalScore;
	}
	

}
