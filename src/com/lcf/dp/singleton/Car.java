package com.lcf.dp.singleton;


//单利模式
public class Car {

	private Car(){};
	//第一种方式 恶汉
	private static final Car car = new Car();
	
	public static Car getInstance(){
		return car;
	}
	
	//第二种方式 懒汉
	
	private static Car newCar;
	
	public static Car getNewInstance(){
		if(newCar == null){
			newCar = new Car();
		}
		return newCar;
	}
	
	public void run(){
		System.out.println("奔跑吧，car……");
	}
}
