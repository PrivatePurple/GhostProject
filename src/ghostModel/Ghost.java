package ghostModel;

public class Ghost
{
	private String name;
	private String color;
	private int numberOfFangs;
	private int spectralMass;
	
	public Ghost()
	{
		this.name = "Boo";
		this.color = "White";
		this.numberOfFangs = 8;
		this.spectralMass = 50;
		
	}

	public Ghost(String name, String color, int numberOfFangs, int spectralMass)
	{
		this.name = name;
		this.color = color;
		this.numberOfFangs = numberOfFangs;
		this.spectralMass = spectralMass;
	}
	
	public String toString()
	{
		String vault = "this Ghost's name is " + name + ", it's color is " + color + ", it has " + numberOfFangs + " fangs, and it's spectral mass is " + spectralMass + " SU.";
		
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
