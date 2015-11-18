package jp.picklesjar.example.ut;

import org.junit.runner.RunWith;

import picklesjar.pickles.ut.runtime.routine.impl.SingleThreadConfigRoutine;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith( Cucumber.class )
@CucumberOptions(
	features = {
		"src/test/resources/pickles.ut/jp.picklesjar.example.ut/ProductClass1Test.feature"
	},
	glue = { "picklesjar.pickledbeans.ut.jp" } )
public class ProductClass1Test_1_getMessage
	extends SingleThreadConfigRoutine {}
