package interfaceandgenerics;

import java.util.Comparator;

public class CarColorComparator  implements Comparator<Car>{

	@Override
	public int compare(Car tcar, Car ocar) {
		// TODO Auto-generated method stub
		return tcar.color.compareTo(ocar.color);
	}

}
