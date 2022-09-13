package Exception;

class TaxCalculator{
	
	public double calculateTax(String empName, boolean isIndian, double empSal){	 //tax calculating method
		double taxAmount=0;
		try {	//try block
		if(isIndian!=true) {	//If the employee not Indian throw this
			throw new CertificateNotYetValidException
			("The employee should be an Indian citizen for calculating tax");
		}
		if(empName=="") {	//If the employee name is null throw this
			throw new EmployeeNameInValidException("The employee name can't be empty");	
		}
		
		// Logic for calculating tax
		
		if(empSal>100000 && isIndian==true) {
			return taxAmount=empSal*8/100;
		}
		if((empSal>50000 && empSal<100000) && isIndian==true) {
			return taxAmount=empSal*6/100;
		}
		if((empSal>30000 && empSal<50000) && isIndian==true) {
			return taxAmount=empSal*5/100;
		}
		if((empSal>10000 && empSal<30000) && isIndian==true) {
			return taxAmount=empSal*4/100;
		}
		
		else {		//not eligible to pay tax throw this
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
	}
		catch(Exception e) {	// catch block
			System.out.println(e);
		}
		return taxAmount;
		}

}