package Insurance.Insurance_Company;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

class Manager {
	private static Logger logger = LogManager.getLogger("App.class");
	
	HealthInsuranceSurveyor healthInsuranceSurveyor ;
	
	

	public Manager(HealthInsuranceSurveyor healthInsuranceSurveyor) {
		super();
		this.healthInsuranceSurveyor = healthInsuranceSurveyor;
	}



	public boolean approve() {
		if (healthInsuranceSurveyor.validate()==(true)) {
			logger.info("Manager has approved your claim.");
			return true;
		}
		return false;
	}
}
