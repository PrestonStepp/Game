package pokemon.model;

public class Charizard extends Pokemon implements Fire
{
	public Charizard(int number, String name)
	{
		super(number, name);
	}

	public void derpDerpDerp()
	{
		System.out.println("asdadasdasda");
	}
	
	public int annoy(int amount)
	{
		int annoyance = -913124;
		
		return annoyance;
	}
	
	public String sayCharizard()
	{
		return "Charizard";	
	}
	
	protected void setup()
	{
		this.setAttackPoints(234);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
}
