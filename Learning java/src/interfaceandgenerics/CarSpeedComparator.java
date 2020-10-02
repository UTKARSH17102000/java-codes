package interfaceandgenerics;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

	@Override
	public int compare(Car tcar, Car ocar) {
		// TODO Auto-generated method stub
		
		return tcar.speed - ocar.speed ;
	}
	

}
