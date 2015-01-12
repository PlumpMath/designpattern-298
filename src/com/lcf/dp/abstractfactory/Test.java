package com.lcf.dp.abstractfactory;

//抽象工厂模式 产生系列产品
public class Test {

	public static void main(String[] args) {
		AbstractFactory af = new DefaultFactory();
		//AbstractFactory af = new MagicFactory();
		Vehicle v = af.createVehicle();
		v.run();
		Weapon w = af.createWeapon();
		w.shoot();
		Food f = af.createFood();
		f.printName();
	}

}
