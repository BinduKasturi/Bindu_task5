package EstimateHouseCost;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Estimation {
	private static final Logger LOG=LogManager.getLogger(Estimation.class);
	public static void main(String[] z)
	{
		Scanner w=new Scanner(System.in);
		LOG.info("standard\nabove standard\nhigh standard\nhigh standard and fully automated\nenter standard : ");
		String InputStandard=w.nextLine();
		LOG.error("enter Area of house in square feet:");
		double AreaOfHouse=w.nextDouble(),EstimatedCost;
		if(InputStandard.equalsIgnoreCase("standard"))
			EstimatedCost=AreaOfHouse*1200;
		else if(InputStandard.equalsIgnoreCase("above standard"))
			EstimatedCost=AreaOfHouse*1500;
		else if(InputStandard.equalsIgnoreCase("high standard"))
			EstimatedCost=AreaOfHouse*1800;
		else if(InputStandard.equalsIgnoreCase("high standard and fully automated")) 
			EstimatedCost=AreaOfHouse*2500;
		else
			EstimatedCost=0;
		LOG.info("Estimated cost is : %.2f",EstimatedCost);
	}
}
