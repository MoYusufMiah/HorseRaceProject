
/**
 * Write a description of class Horse here.
 * 
 * Mohammad Yusuf Miah	
 * @1.3
 */
public class Horse
{
    //Fields of class Horse
    private char symbol;
    private String name;
    private int distance;
    private boolean fallen;
    private double confidence;
    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
       symbol=horseSymbol;
       name=horseName;
       confidence=horseConfidence;
    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        fallen=true;
    }
    
    public double getConfidence()
    {
        return confidence;
    }
    
    public int getDistanceTravelled()
    {
        return distance;
    }
    
    public String getName()
    {
        return name;
    }
    
    public char getSymbol()
    {
        return symbol;
    }
    
    public void goBackToStart()
    {
        distance=0;
    }
    
    public boolean hasFallen()
    {
        if (fallen==true){
		return true;
	}
	else {
		return false;
	}
    }

    public void moveForward()
    {
        distance=distance+1;
    }

    public void setConfidence(double newConfidence)
    {
        confidence= newConfidence;
    }
    
    public void setSymbol(char newSymbol)
    {
        symbol = newSymbol;
    }
    
}
