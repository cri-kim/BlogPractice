package week.seven;

import org.junit.jupiter.api.Test;

import week.five.BinaryTree;
/*
 * test
 * */
public class WeekSevenTests {
	
	@Test
	public void PackageTests() {
		Package pkg = new Package();
		week.Package oPkg = pkg.getOtherPackageClass();
		String str = oPkg.str1;
		String str2 = oPkg.str2;//impassive to get private value
		String str3 = oPkg.str3;//impassive to get protected value( not same package )
		
	}
	
	@Test
	public void ModifiersTests() {
		Modifiers mod = new Modifiers();
		String str = mod.str; //protected 접근제어자는 같은 패키지 내에서 값을 가져올 수 있다.
	}
}
