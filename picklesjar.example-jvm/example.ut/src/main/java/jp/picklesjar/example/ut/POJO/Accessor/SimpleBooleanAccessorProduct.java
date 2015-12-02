package jp.picklesjar.example.ut.POJO.Accessor;

import picklesjar.picklerecipes.ut.variable.AccessorDataBridgeVariable;

/**
 * 
 * 
 * 
 * @author PicklesCooker
 *
 */
public class SimpleBooleanAccessorProduct {
	
	@AccessorDataBridgeVariable(
		getter = "getFlag()", setter = "setFlag(Boolean)" )
	private Boolean flag = false;
	
	/**
	 * 
	 * 
	 * 
	 * @param flag
	 */
	public void setFlag( Boolean flag ) {
	
		this.flag = flag;
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param flag
	 */
	public Boolean getFlag() {
	
		return flag;
	}
	
}
