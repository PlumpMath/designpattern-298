package com.lcf.spring.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Properties props = new Properties();
		props.load(Test.class.getClassLoader().
				getResourceAsStream("com/lcf/spring/factory/spring.properties"));
		String VehicleType = props.getProperty("VehicleType");
		System.out.println(VehicleType);
		Object o = Class.forName(VehicleType).newInstance();
		
		Moveable m = (Moveable)o;
		m.run();
	}

}
