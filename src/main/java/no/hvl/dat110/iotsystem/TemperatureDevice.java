package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		//  - start

		Client c1 = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);
		c1.connect();
		
		for(int i = 0; i<COUNT; i++){
			c1.publish(Common.TEMPTOPIC, ""+sn.read());
		}
		c1.disconnect();

		// create a client object and use it to

		// - connect to the broker - user "sensor" as the user name
		// - publish the temperature(s)
		// - disconnect from the broker

		//  - end

		System.out.println("Temperature device stopping ... ");

		

	}
}
