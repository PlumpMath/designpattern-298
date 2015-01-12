package com.lcf.dp.abstractfactory;

//���󹤳�ģʽ ����ϵ�в�Ʒ
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
