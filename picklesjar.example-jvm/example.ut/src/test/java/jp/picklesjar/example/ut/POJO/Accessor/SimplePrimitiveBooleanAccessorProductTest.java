package jp.picklesjar.example.ut.POJO.Accessor;

import picklesjar.pickle.ut.prepare.TestTargetMethodMapping;
import picklesjar.pickle.ut.prepare.UnitTestWithCucumber;
import picklesjar.pickle.ut.prepare.design.StereotypeDesign;

@UnitTestWithCucumber( "picklesjar.pickledbeans.ut.jp" )
@TestTargetMethodMapping(
	query = "getFlag()",
	stereotype = StereotypeDesign.ACCESSOR_GETTER )
@TestTargetMethodMapping(
	query = "setFlag( boolean )",
	stereotype = StereotypeDesign.ACCESSOR_SETTER )
public class SimplePrimitiveBooleanAccessorProductTest {}
