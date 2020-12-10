package ex02;

public enum ItemType {
	Drug,
	Food,
	Crop,
	Other;
	
	/**
	 * This should return the tax rate of the type :
	 * - Drug : 0.02
	 * - Food : 0.05
	 * - Crop : 0.1
	 * - Other : 0.2
	 */
	public double getTaxRate() {
		if (this == Drug) {
			return 0.15;
		} else {
			return 0.05;
		}
	}
	
}
