package Puck;
public class Puck extends Disk 
{
   double MIN_STD_W = 5;
   double MAX_STD_W =5.5;
   double MIN_YTH_W = 4;
   double MAX_YTH_W = 4.5;
  
   private double weight;
   private boolean standard, youth;
  
   //Constructor Method
   public Puck(double w)
   {
   	super(1.5, 1);
   	weight = w;
   	
   	if(weight >= MIN_STD_W && weight <= MAX_STD_W)
   	{
   		standard = true;
   		youth = false;
   	}
   	else
   	{
   		standard = false;
   		youth = true;
   	}
   }//Closes the constructor method
  
   //Accessor Method
   public double getWeight()
   {
   	return weight;
   }
  
   //Modifier Method
   public void setWeight(double w)
   {
   	weight = w;
   }
  
   //Get Division Method
   public String getDivision()
   {
   	String div;
   	if(standard)
   	{
   		div = "Puck Is Standard;";
   	}
   	else
   	{
   		div = "Puck Is Youth.";
   	}
   	return div;
   		
   }
  
  
  
}

