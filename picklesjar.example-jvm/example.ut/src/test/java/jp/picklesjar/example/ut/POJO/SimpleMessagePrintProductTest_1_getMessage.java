package jp.picklesjar.example.ut.POJO;

import org.junit.runner.RunWith;

import picklesjar.pickle.ut.runtime.routine.impl.SingleThreadConfigRoutine;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith( Cucumber.class )
@CucumberOptions(
	features = {
		"src/test/resources/PicklesJar.ut/jp.picklesjar.example.ut.POJO/SimpleMessagePrintProductTest.feature"
	},
	glue = { "picklesjar.pickledbeans.ut.jp" } )
public class SimpleMessagePrintProductTest_1_getMessage
	extends SingleThreadConfigRoutine {}
