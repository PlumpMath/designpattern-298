package com.lcf.dp.simplefactory;

//����ģʽ���򵥹���ģʽ��������һ��Ʒ
public class Test {

	public static void main(String[] args) {
		VehicleFactory vehicle = new PlaneFactory();
		Moveable m = vehicle.create();
		m.run();
	}

}
