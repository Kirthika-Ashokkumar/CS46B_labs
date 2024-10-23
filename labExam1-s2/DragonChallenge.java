package tournament;

public class DragonChallenge implements MagicalChallenge{
	private String name;
	private double difficultyLevel;
	
	public DragonChallenge(String n, double dL) {
		name = n;
		difficultyLevel = dL;
	}

	@Override
	public String getName() {
	
		return name;
	}

	@Override
	public void setName(String n) {
		name = n;
		
	}

	@Override
	public void performChallenge() {
		System.out.println("Facing the might dragon named "+name+ " and difficulty level of" + difficultyLevel);
	}
	
	public double getdifficultyLevel() {
		return difficultyLevel;
	}

}
