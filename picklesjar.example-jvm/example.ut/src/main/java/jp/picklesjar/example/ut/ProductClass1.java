package jp.picklesjar.example.ut;

import picklesjar.pickles.ut.recipes.variable.AccessorDataBridgeVariable;

/**
 * 
 * 
 * 
 * @author PicklesCooker
 *
 */
public class ProductClass1 {
	
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
	
	/**
	 * 
	 * 
	 * 
	 * @return
	 */
	public String getMessage() {
	
		return "こんにちは";
	}
	
	/**
	 * 
	 * 
	 * 
	 */
	public void printMessage() {
	
		System.out.println( getMessage() );
	}
	
}
