package jp.picklesjar.example.ut;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import picklesjar.pickles.ut.core.util.MethodQuery;
import picklesjar.pickles.ut.prepare.design.StereotypeDesign;
import picklesjar.pickles.ut.runtime.routine.impl.MethodTargetingOnSingleThreadRoutine;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith( Cucumber.class )
@CucumberOptions(
	features = {
		"classpath:META-INF/picklesjar.pickledbeans.ut.jp/POJO/Accessor/primitiveBoolean.feature"
	},
	glue = { "picklesjar.pickledbeans.ut.jp" },
	tags = {
		"@ACCESSOR_GETTER", "@DETAIL", "~@ACCESSOR_GETTER_AND_SETTER_PAIR" } )
public class ProductClass1Test_2_getFlag
	extends MethodTargetingOnSingleThreadRoutine {
	
	@BeforeClass
	public static void setUp() {
	
		MethodQuery method = null;
		try {
			method = MethodQuery.newInstance( "getFlag()" );
		} catch( Exception exp ) {}
		
		MethodTargetingOnSingleThreadRoutine.setUp(
			ProductClass1.class, method, StereotypeDesign.ACCESSOR_GETTER );
	}
	
}
