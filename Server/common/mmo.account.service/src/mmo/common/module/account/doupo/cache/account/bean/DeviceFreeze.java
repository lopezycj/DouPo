﻿package mmo.common.module.account.doupo.cache.account.bean;

/**
 * 冻结设备
 * 
 * @author fanren
 * 
 */
public class DeviceFreeze {
	private String deviceImei;
	private long   timeFreeze;
	private long   timeOperate;

	public String getDeviceImei() {
		return deviceImei;
	}

	public void setDeviceImei(String deviceImei) {
		this.deviceImei = deviceImei;
	}

	public long getTimeFreeze() {
		return timeFreeze;
	}

	public void setTimeFreeze(long timeFreeze) {
		this.timeFreeze = timeFreeze;
	}

	public long getTimeOperate() {
		return timeOperate;
	}

	public void setTimeOperate(long timeOperate) {
		this.timeOperate = timeOperate;
	}
}
