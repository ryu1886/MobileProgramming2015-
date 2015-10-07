

package kr.ac.embedded.kookmin.callback;

public class CallbackTest implements OnMaxNumberCb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbackTest callTest = new CallbackTest();
		Sum total = new Sum();
			
		total.setMaxNumber(50);
		total.setOnMaxNumberCb(callTest);
		
		for ( int i=1; i<=11; i++) {
			total.addNumber(i);
		}
		
		System.out.println("Total is" + total.getTotal());
	}

	@Override
	public void onMaxNumber(int number, int exceed) {
		// TODO Auto-generated method stub
		// 구현하시오 //
			
		System.out.println("Current sum is "+number+ " and exceeds "+exceed);
	}
	

}


/*

 -Output-
 Current sum is 55 and exceeds 5
 Current sum is 66 and exceeds 16
 Total is66
 
 
public interface OnMaxNumberCb {
	void onMaxNumber(int number, int exceed);
}
*/