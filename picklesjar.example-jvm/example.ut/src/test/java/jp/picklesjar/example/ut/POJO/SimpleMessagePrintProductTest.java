package jp.picklesjar.example.ut.POJO;

import picklesjar.pickles.ut.prepare.TestTargetMethodMapping;
import picklesjar.pickles.ut.prepare.UnitTestWithCucumber;

@UnitTestWithCucumber( "picklesjar.pickledbeans.ut.jp" )
@TestTargetMethodMapping(
	query = "getMessage()",
	features = { "src/test/resources/pickles.ut/jp.picklesjar.example.ut.POJO/SimpleMessagePrintProductTest.feature" } )
public class SimpleMessagePrintProductTest {}
