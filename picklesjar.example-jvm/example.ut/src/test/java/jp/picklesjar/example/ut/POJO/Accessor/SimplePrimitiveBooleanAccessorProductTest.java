package jp.picklesjar.example.ut.POJO.Accessor;

import picklesjar.pickles.ut.prepare.TestTargetMethodMapping;
import picklesjar.pickles.ut.prepare.UnitTestWithCucumber;
import picklesjar.pickles.ut.prepare.design.StereotypeDesign;

@UnitTestWithCucumber( "picklesjar.pickledbeans.ut.jp" )
@TestTargetMethodMapping(
	query = "getFlag()",
	stereotype = StereotypeDesign.ACCESSOR_GETTER )
@TestTargetMethodMapping(
	query = "setFlag( boolean )",
	stereotype = StereotypeDesign.ACCESSOR_SETTER )
public class SimplePrimitiveBooleanAccessorProductTest {}
