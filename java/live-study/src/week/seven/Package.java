//1.package keyword
//week.seven package
//seven은 week 의 subpackage
package week.seven;

public class Package {

	//다른 패키지라면, 동일 클래스명 사용 가능
	public week.Package getOtherPackageClass() {
		return new week.Package();
	}
}
