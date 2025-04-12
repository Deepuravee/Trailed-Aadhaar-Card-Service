class  AadhaarCardDetails
{
	//States - Required Input and Details 
	private String CardNumber;
	private String name; 
	private String DOB; 
	private String Gender;
	private String Address;
	
	//Constructor
	AadhaarCardDetails () {}
	
	AadhaarCardDetails (String CardNumber, String name, String DOB, String Gender, String Address) {
		//LI - Loading all the non static members into the data
		this.CardNumber = CardNumber; 
		this.name = name; 
		this.DOB = DOB; 
		this.Gender = Gender; 
		this.Address = Address; 
	}
	
	//Getters Required - view
	public String getCardNumber() {
		return CardNumber;
	}
	
	public String getname() {
		return name; 
	}
	
	public String getDOB() {
		return DOB; 
	}
	
	public String getGender() {
		return Gender; 
	}
	
	public String getAddress() {
		return Address; 
	}
	
	//Setters Required - view
	public void setCardNumber(String CardNumber) {
		this.CardNumber= CardNumber; 
	}
	
	public void setname(String name) {
		this.name= name; 
	}
	
	public void setDOB(String DOB) {
		this.DOB= DOB; 
	}
	
	public void setGender(String Gender) {
		this.Gender= Gender; 
	}
	
	public void setAddress(String Address) {
		this.Address= Address; 
	}
	
	public void Display() {
		System.out.println("Aadhaar Number : " +CardNumber); 
		System.out.println("Name : " +name); 
		System.out.println("Date of Birth : " +DOB); 
		System.out.println("Gender : " +Gender); 
		System.out.println("Address : " +Address); 
	}
}
