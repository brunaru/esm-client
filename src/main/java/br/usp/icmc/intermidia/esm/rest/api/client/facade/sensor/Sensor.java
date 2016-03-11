package br.usp.icmc.intermidia.esm.rest.api.client.facade.sensor;

import br.usp.icmc.intermidia.esm.rest.api.client.facade.AbstractJsonModel;

public class Sensor extends AbstractJsonModel {
	
	/** Used for capturing sensors during an interval. */
	public static final int SENSOR_TYPE_INTERVAL = 0;
	
	/** Used for capturing sensors during a event. */
	public static final int SENSOR_TYPE_TASK = 1;
	
	/** Activity sensor. */
	public static final int SENSOR_ACTIVITY = 1;
	
	/** Interval or whole event. */
	private int sensorType;
	
	/** ACITIVTY, LIGHT, AUDIO, ETC. */
	private int sensor;

	public int getSensor() {
		return sensor;
	}

	public void setSensor(int sensor) {
		this.sensor = sensor;
	}

	public int getSensorType() {
		return sensorType;
	}

	public void setSensorType(int sensorType) {
		this.sensorType = sensorType;
	}

}
