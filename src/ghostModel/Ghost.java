package ghostModel;

public class Ghost
{
	private String name;
	private String color;
	private int numberOfFangs;
	private int spectralMass;
	
	//Default Constructor
	public Ghost()
	{
		this.name = "Boo";
		this.color = "White";
		this.numberOfFangs = 8;
	}

	public Ghost(String name, String color, int numberOfFangs)
	{
		this.name = name;
		this.color = color;
		this.numberOfFangs = numberOfFangs;
	}
	
	public Ghost(String name, int spectralMass, String color)
	{
		this.name = name;
		this.spectralMass = spectralMass;
		this.color = color;
		
	}
	
	public String toString()
	{
		String vault = "["+name+"]";
		
		return vault;
	}
	
	//-[GET]--
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int numberOfFangs()
	{
		return numberOfFangs;
	}
	
	public int spectralMass()
	{
		return spectralMass;
	}

	//--[SET]--
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setNumberOfFangs(int numberOfFangs)
	{
		this.numberOfFangs = numberOfFangs;
	}
	
	public void setSpectralMass(int spectralMass)
	{
		this.spectralMass = spectralMass;
	}
	
	
}
