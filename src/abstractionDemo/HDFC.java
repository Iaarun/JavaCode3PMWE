package abstractionDemo;

public  class HDFC  extends RBI implements Interface1{

	@Override
	public void HomeLoanroi() {
		System.out.println("HDFC Home loan is  8.5%");
		
	}
	
	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.HomeLoanroi();
		hdfc.test1(12);
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1(int a) {
		// TODO Auto-generated method stub
		
	}

	

}
