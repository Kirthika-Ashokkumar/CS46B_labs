package tournament;

public class LakeChallenge implements MagicalChallenge{

	private String name;
	private int depth;
	
	public LakeChallenge(String name, int depth) {
		this.name = name;
		this.depth = depth;
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
		System.out.println("Swiming in lake "+ name +" with a depth of "+ depth);
		
	}
	
	public int getdepth(){
		return depth;
	}	
	
}
