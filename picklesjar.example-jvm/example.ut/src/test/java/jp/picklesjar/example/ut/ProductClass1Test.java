package jp.picklesjar.example.ut;

import org.junit.runner.RunWith;

import picklesjar.pickles.ut.prepare.TestTargetMethodMapping;
import picklesjar.pickles.ut.prepare.UnitTestWithCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// TODO Remove
@RunWith( Cucumber.class )
// TODO Remove
@CucumberOptions(
	features = {
		"src/test/resources/pickles.ut/jp.picklesjar.example.ut/ProductClass1Test.feature", },
	// "classpath:META-INF/picklesjar.pickledbeans.ut.jp/POJO/DTO/Boolean_IO.feature" },
	glue = {
		"picklesjar.pickledbeans.ut.jp",
		"picklesjar.pickledbeans.ut.hooks.lock_only" } )
@UnitTestWithCucumber( "picklesjar.pickledbeans.ut.jp" )
@TestTargetMethodMapping(
	query = "getMessage",
	pickled_features = { "POJO/DTO/Boolean_IO" }, // "classpath:META-INF/picklesjar.pickledbeans.ut.jp/POJO/DTO/Boolean_IO.feature"
	hook = picklesjar.pickledbeans.ut.hooks.lock_only.Hook.class )
public class ProductClass1Test {}
