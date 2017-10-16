package Insurance.Insurance_Company;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

class HealthInsuranceSurveyor implements Surveyor{
	private static Logger logger = LogManager.getLogger("App.class");
	
//	Claim  c1 = new Claim();
//	String claim1 = c1.getClaimType();
	public Claim c12;
	
	public HealthInsuranceSurveyor(Claim c12) {
		this.c12=c12;
	}

	public boolean validate() {
		
		if (c12.getClaimType().equals("HealthInsurance")) {
			logger.info("Health Insurance Surveyor has approved your claim.");
			return true;
		}
		return false;
	}
}
