
public class Test {
	
	private int _quantity;
	private int _itemPrice;
	
	double price() {
		
		// price is base price - quantity discount + shipping 
		// return _quantity * _itemPrice - Math.max(0, _quantity - 500) * _itemPrice * 0.05 + Math.min(_quantity * _itemPrice * 0.1, 100.0);
		
		// rewrite the method above into 3 separate methods, one for base price
		// another one for discount and the last one for shipping.
		
		return computeBasePrice() - computeDiscount() + computeShippingCost();
	}
	
	public double computeBasePrice() {
		return _quantity * _itemPrice;
	}
	
	public double computeDiscount() {
		return Math.max(0, _quantity - 500) * _itemPrice * 0.05;
	}
	
	public double computeShippingCost() {
		return Math.min(_quantity * _itemPrice * 0.1, 100.0);
	}
	

}
