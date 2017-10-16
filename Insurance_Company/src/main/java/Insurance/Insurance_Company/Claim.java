package Insurance.Insurance_Company;

class Claim {
	
	private int claimId;
	private String claimType;
	
	///getter and setter method for claim id
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	
	///getter and setter method for claim name
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
}
