package comsats.sc.adapter;

public class RunAdapterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object for Xpay
		Xpay xpay = new Xpay_Impl();
		xpay.setCreditCardNo("4789565874102365");
		xpay.setCustomerName("Mutahir Ali");
		xpay.setCardExpMonth("09");
		xpay.setCardExpYear("2025");
		xpay.setCardCVVNo((short) 235);
		xpay.setAmount(2565.23);

	    Dpay dpay = new XpayToDpayAdapter(xpay);
		testdpay(dpay);
	}

	private static void testdpay(Dpay dpay) {

		System.out.println(dpay.getCardOwnerName());
		System.out.println(dpay.getCustCardNo());
		System.out.println(dpay.getCardExpMonthDate());
		System.out.println(dpay.getCVVNo());
		System.out.println(dpay.getTotalAmount());
	}

}
