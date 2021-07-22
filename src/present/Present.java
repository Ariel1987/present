package present;

public class Present {

	private static final int DEFAULT_CART_CAPACITY = 10;
	private Sweet[] sweets;
	private int lastIndexAdded;
	
	{
		sweets = new Sweet[DEFAULT_CART_CAPACITY];
	}
	
	public void addSweet(Sweet sweet) {

		if(sweet == null) {
			return;
		}
		
		sweets[lastIndexAdded++] = sweet;
    
    }

	public double calculateTotalWeight() {

		double totalWeight = 0;
		
		for(Sweet sweet: sweets) {
			if(sweet != null) {
				totalWeight += sweet.getWeight();
			}
		}
		return totalWeight;
		
	}

    public Sweet[] filterSweetsBySugarRange(double minSugarWeight,double maxSugarWeight) {
    	
    	int filteredBySugarRangeIndex = 0;

    	for(Sweet sweet: sweets) {

    		if (sweet != null && (sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight)) {
    			filteredBySugarRangeIndex++;
    		}
    	}
    	
    	Sweet[] filteredBySugarRange = new Sweet[filteredBySugarRangeIndex];
    	
    	int i = 0;
    	for(Sweet sweet: sweets) {
    		if(sweet != null && (sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight)) {
    			filteredBySugarRange[i++] = sweet;
    		}
    	}
    	return filteredBySugarRange;

	}

	public Sweet[] getSweets() {

		int sweetsAmount = 0;
		
		for(Sweet sweet: sweets) {
			if(sweet != null) {
				sweetsAmount++;
			}
		}
		
		Sweet[] copiedArray = new Sweet[sweetsAmount];
		
		int i = 0;
		for(Sweet sweet: sweets) {
			if(sweet != null) {
				copiedArray[i++] = sweet;		
			}
		}
		return copiedArray;
	}
	
}
