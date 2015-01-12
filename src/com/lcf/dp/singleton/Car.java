package com.lcf.dp.singleton;


//����ģʽ
public class Car {

	private Car(){};
	//��һ�ַ�ʽ ��
	private static final Car car = new Car();
	
	public static Car getInstance(){
		return car;
	}
	
	//�ڶ��ַ�ʽ ����
	
	private static Car newCar;
	
	public static Car getNewInstance(){
		if(newCar == null){
			newCar = new Car();
		}
		return newCar;
	}
	
	public void run(){
		System.out.println("���ܰɣ�car����");
	}
}
