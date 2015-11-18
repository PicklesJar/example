package jp.picklesjar.example.ut.POJO.Accessor;

import picklesjar.pickles.ut.recipes.variable.AccessorDataBridgeVariable;

/**
 * 
 * 
 * 
 * @author PicklesCooker
 *
 */
public class SimplePrimitiveBooleanAccessorProduct {
	
	@AccessorDataBridgeVariable(
		getter = "getFlag()", setter = "setFlag(boolean)" )
	private boolean flag = false;
	
	/**
	 * 
	 * 
	 * 
	 * @param flag
	 */
	public void setFlag( boolean flag ) {
	
		this.flag = flag;
	}
	
	/**
	 * 
	 * 
	 * 
	 * @param flag
	 */
	public boolean getFlag() {
	
		return flag;
	}
	
}
