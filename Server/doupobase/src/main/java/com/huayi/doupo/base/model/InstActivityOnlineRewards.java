package com.huayi.doupo.base.model;

import java.io.*;

/**
	在线奖励实例表
*/
@SuppressWarnings("serial")
public class InstActivityOnlineRewards implements Serializable
{
	private int index;
	public String result = "";
	/**
		编号
	*/
	private int id;
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
		index = 1;
		result += index + "*int*" + id + "#";
	}

	public void setId(int id, int bs) {
		this.id = id;
	}

	/**
		玩家实例Id
	*/
	private int instPlayerId;
	public int getInstPlayerId(){
		return instPlayerId;
	}
	public void setInstPlayerId(int instPlayerId) {
		this.instPlayerId = instPlayerId;
		index = 2;
		result += index + "*int*" + instPlayerId + "#";
	}

	public void setInstPlayerId(int instPlayerId, int bs) {
		this.instPlayerId = instPlayerId;
	}

	/**
		在线奖励字典Id
	*/
	private int onlineRewardsId;
	public int getOnlineRewardsId(){
		return onlineRewardsId;
	}
	public void setOnlineRewardsId(int onlineRewardsId) {
		this.onlineRewardsId = onlineRewardsId;
		index = 3;
		result += index + "*int*" + onlineRewardsId + "#";
	}

	public void setOnlineRewardsId(int onlineRewardsId, int bs) {
		this.onlineRewardsId = onlineRewardsId;
	}

	/**
		在线倒计时毫秒数 0表示结束 
	*/
	private int onlineTime;
	public int getOnlineTime(){
		return onlineTime;
	}
	public void setOnlineTime(int onlineTime) {
		this.onlineTime = onlineTime;
		index = 4;
		result += index + "*int*" + onlineTime + "#";
	}

	public void setOnlineTime(int onlineTime, int bs) {
		this.onlineTime = onlineTime;
	}

	/**
		奖励物品 tableTypeId_tableFieldId_tableValue
	*/
	private String things;
	public String getThings(){
		return things;
	}
	public void setThings(String things) {
		this.things = things;
		index = 5;
		result += index + "*String*" + things + "#";
	}

	public void setThings(String things, int bs) {
		this.things = things;
	}

	/**
		版本号
	*/
	private int version;
	public int getVersion(){
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
		index = 6;
		result += index + "*int*" + version + "#";
	}

	public void setVersion(int version, int bs) {
		this.version = version;
	}

	/**
		添加时间
	*/
	private String insertTime;
	public String getInsertTime(){
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
		index = 7;
		result += index + "*String*" + insertTime + "#";
	}

	public void setInsertTime(String insertTime, int bs) {
		this.insertTime = insertTime;
	}

	/**
		更新时间
	*/
	private String updateTime;
	public String getUpdateTime(){
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
		index = 8;
		result += index + "*String*" + updateTime + "#";
	}

	public void setUpdateTime(String updateTime, int bs) {
		this.updateTime = updateTime;
	}

	public String getResult(){
		return result;
	}

	public InstActivityOnlineRewards clone(){
		InstActivityOnlineRewards extend=new InstActivityOnlineRewards();
		extend.setId(this.id);
		extend.setInstPlayerId(this.instPlayerId);
		extend.setOnlineRewardsId(this.onlineRewardsId);
		extend.setOnlineTime(this.onlineTime);
		extend.setThings(this.things);
		extend.setVersion(this.version);
		extend.setInsertTime(this.insertTime);
		extend.setUpdateTime(this.updateTime);
		return extend;
	}
}
