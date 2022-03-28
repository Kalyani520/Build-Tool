package com.buildtool.model;

import java.util.List;

public class ConnectorVO {

	
	private int selCustomerName;
	private int selErwinDISVersion;
	private int selEnvType;
	private int[] selConneType;
	private int[] selConnectors;

	
	//Below are metadata purpose
	private List<GenVO> customerNamesList;
	private List<GenVO> erwinDISVersionList;
	private List<GenVO> envTypeList;
	private List<GenVO> connectorTypeList;
	private List<GenVO> connectorNameList;
	public int getSelCustomerName() {
		return selCustomerName;
	}
	public void setSelCustomerName(int selCustomerName) {
		this.selCustomerName = selCustomerName;
	}
	public int getSelErwinDISVersion() {
		return selErwinDISVersion;
	}
	public void setSelErwinDISVersion(int selErwinDISVersion) {
		this.selErwinDISVersion = selErwinDISVersion;
	}
	public int getSelEnvType() {
		return selEnvType;
	}
	public void setSelEnvType(int selEnvType) {
		this.selEnvType = selEnvType;
	}
	public int[] getSelConneType() {
		return selConneType;
	}
	public void setSelConneType(int[] selConneType) {
		this.selConneType = selConneType;
	}
	public int[] getSelConnectors() {
		return selConnectors;
	}
	public void setSelConnectors(int[] selConnectors) {
		this.selConnectors = selConnectors;
	}
	public List<GenVO> getCustomerNamesList() {
		return customerNamesList;
	}
	public void setCustomerNamesList(List<GenVO> customerNamesList) {
		this.customerNamesList = customerNamesList;
	}
	public List<GenVO> getErwinDISVersionList() {
		return erwinDISVersionList;
	}
	public void setErwinDISVersionList(List<GenVO> erwinDISVersionList) {
		this.erwinDISVersionList = erwinDISVersionList;
	}
	public List<GenVO> getEnvTypeList() {
		return envTypeList;
	}
	public void setEnvTypeList(List<GenVO> envTypeList) {
		this.envTypeList = envTypeList;
	}
	public List<GenVO> getConnectorTypeList() {
		return connectorTypeList;
	}
	public void setConnectorTypeList(List<GenVO> connectorTypeList) {
		this.connectorTypeList = connectorTypeList;
	}
	public List<GenVO> getConnectorNameList() {
		return connectorNameList;
	}
	public void setConnectorNameList(List<GenVO> connectorNameList) {
		this.connectorNameList = connectorNameList;
	}
	
	
	private int connectorID;
	private String connectorName;
	private String connectorGitHubURL;
	public int getConnectorID() {
		return connectorID;
	}
	public void setConnectorID(int connectorID) {
		this.connectorID = connectorID;
	}
	public String getConnectorName() {
		return connectorName;
	}
	public void setConnectorName(String connectorName) {
		this.connectorName = connectorName;
	}
	public String getConnectorGitHubURL() {
		return connectorGitHubURL;
	}
	public void setConnectorGitHubURL(String connectorGitHubURL) {
		this.connectorGitHubURL = connectorGitHubURL;
	}
	
	
	

}
