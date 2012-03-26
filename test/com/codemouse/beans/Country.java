package com.codemouse.beans;

/**
 * JavaBean: 国家
 * @author 	ChengJiaRong
 * @since 	2012-3-16
 */
public class Country {
	
	private String code;
	private boolean showCode;
	
	private String PropertyName;
	public String getPropertyName() {
		return PropertyName;
	}
	public void setPropertyName(String propertyName) {
		PropertyName = propertyName;
	}
	
	private Double Xcoordinate;
	public Double getXcoordinate() {
		return Xcoordinate;
	}
	public void setXcoordinate(Double xcoordinate) {
		Xcoordinate = xcoordinate;
	}

	public String displayInfo(){
		String info = "名称：" + this.PropertyName;
		if(this.showCode){
			info += " 编码：" + this.code;
		}
		return info;
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isShowCode() {
		return showCode;
	}
	public void setShowCode(boolean showCode) {
		this.showCode = showCode;
	}


	
}
