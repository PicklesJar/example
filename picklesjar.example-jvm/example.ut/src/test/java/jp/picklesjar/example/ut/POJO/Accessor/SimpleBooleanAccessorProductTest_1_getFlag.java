package jp.picklesjar.example.ut.POJO.Accessor;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import picklesjar.pickle.ut.core.util.MethodQuery;
import picklesjar.pickle.ut.prepare.design.StereotypeDesign;
import picklesjar.pickle.ut.runtime.routine.impl.MethodTargetingOnSingleThreadRoutine;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith( Cucumber.class )
@CucumberOptions(
	features = {
		"classpath:META-INF/picklesjar.pickledbeans.ut.jp/POJO/Accessor/Boolean.feature"
	},
	glue = { "picklesjar.pickledbeans.ut.jp" },
	tags = {
		"@ACCESSOR_GETTER", "@DETAIL", "~@ACCESSOR_GETTER_AND_SETTER_PAIR" } )
public class SimpleBooleanAccessorProductTest_1_getFlag
	extends MethodTargetingOnSingleThreadRoutine {
	
	@BeforeClass
	public static void setUp() {
	
		MethodQuery method = null;
		try {
			method = MethodQuery.newInstance( "getFlag()" );
		} catch( Exception exp ) {}
		
		MethodTargetingOnSingleThreadRoutine.setUp(
			SimpleBooleanAccessorProduct.class, method, StereotypeDesign.ACCESSOR_GETTER );
	}
	
}
