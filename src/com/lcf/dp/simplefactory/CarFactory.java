package com.lcf.dp.simplefactory;

public class CarFactory extends VehicleFactory {

	@Override
	Moveable create() {
		return new Car();
	}

}
