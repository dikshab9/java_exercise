package Insurance.Insurance_Company;

public class Insurance {

	public static void main(String[] args) {
	
		//Creating an instance of claim and setting claimId and claimType
		Claim claim = new Claim();
		claim.setClaimId(1);
		claim.setClaimType("HealthInsurance");
		
		//Creating an instance of Customer and setting customerId and customerName
		Customer cust1 =new Customer();
		cust1.setCustomerId(1);
		cust1.setCustomerName("HariGopal");
		
		//Creating an instance of Health Insurance Surveyor
		HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor(claim);
		
		//Creating an instance of Manager
		Manager manager = new Manager(healthInsuranceSurveyor);
		manager.approve();
	}

}
