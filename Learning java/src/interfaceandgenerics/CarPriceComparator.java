package interfaceandgenerics;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

	@Override
	public int compare(Car tcar, Car ocar) {
		// TODO Auto-generated method stub
		
		return ocar.price-tcar.price;
	}

}
