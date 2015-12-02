package jp.picklesjar.example.ut.POJO;

import picklesjar.pickle.ut.prepare.TestTargetMethodMapping;
import picklesjar.pickle.ut.prepare.UnitTestWithCucumber;

@UnitTestWithCucumber( "picklesjar.pickledbeans.ut.jp" )
@TestTargetMethodMapping(
	query = "getMessage()",
	features = { "src/test/resources/PicklesJar.ut/jp.picklesjar.example.ut.POJO/SimpleMessagePrintProductTest.feature" } )
public class SimpleMessagePrintProductTest {}
