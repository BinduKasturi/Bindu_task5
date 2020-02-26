package SimpleIntrest_and_CompoundIntrest;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculate {
	private static final Logger LOG=LogManager.getLogger(Calculate.class);
	public static void main(String[] z)
	{
		Scanner w=new Scanner(System.in); 
		LOG.info("enter principal amount:");
		double PrincipalAmount=w.nextDouble();
		LOG.info("enter rate of intrest:");
		double InterestRate=w.nextDouble();
		LOG.info("enter time:");
		int numberOfYears=w.nextInt();
		double SimpleIntrest,CompoundIntrest;
		SimpleIntrest=PrincipalAmount*numberOfYears*(InterestRate/100);
		CompoundIntrest=PrincipalAmount*(Math.pow(1+(InterestRate/100),numberOfYears))-PrincipalAmount;//compounded annually
		LOG.info("SimpleIntrest is:%.2f\n",SimpleIntrest);
		LOG.info("CompoundIntrest is:%.2f\n",CompoundIntrest);
	}
}
