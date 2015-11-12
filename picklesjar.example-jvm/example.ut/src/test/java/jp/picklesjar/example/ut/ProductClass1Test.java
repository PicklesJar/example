package jp.picklesjar.example.ut;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import picklesjar.pickles.ut.core.util.MethodQuery;
import picklesjar.pickles.ut.prepare.TestTargetMethodMapping;
import picklesjar.pickles.ut.prepare.UnitTestWithCucumber;
import picklesjar.pickles.ut.runtime.routine.impl.MethodTargetingOnSingleThreadRoutine;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// TODO Remove
@RunWith( Cucumber.class )
// TODO Remove
@CucumberOptions(
	features = {
		"src/test/resources/pickles.ut/jp.picklesjar.example.ut/ProductClass1Test.feature",
		"classpath:META-INF/picklesjar.pickledbeans.ut.jp/POJO/DTO/Boolean_IO.feature"
	},
	glue = { "picklesjar.pickledbeans.ut.jp" } )
@UnitTestWithCucumber( "picklesjar.pickledbeans.ut.jp" )
@TestTargetMethodMapping(
	query = "getMessage",
	features = { "classpath:META-INF/picklesjar.pickledbeans.ut.jp/POJO/DTO/Boolean_IO.feature" } )
public class ProductClass1Test
	extends MethodTargetingOnSingleThreadRoutine {
	
	@BeforeClass
	public static void setUp() {
	
		MethodQuery method = null;
		try {
			method = MethodQuery.newInstance( "getFlag(boolean)" );
		} catch( Exception exp ) {}
		
		MethodTargetingOnSingleThreadRoutine.setUp( ProductClass1.class, method );
	}
	
}
