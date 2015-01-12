package com.lcf.dp.simplefactory;

//工厂模式（简单工厂模式）产生单一产品
public class Test {

	public static void main(String[] args) {
		VehicleFactory vehicle = new PlaneFactory();
		Moveable m = vehicle.create();
		m.run();
	}

}
