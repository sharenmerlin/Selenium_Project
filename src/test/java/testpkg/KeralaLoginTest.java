package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.KeralaBaseClass;

public class KeralaLoginTest extends KeralaBaseClass

{
	
	@Test
	public void loginTest()
	{
	loginobj.loginmethod("sharen.binu1@gmail.com", "luminar123");
	}
	
	@Test
    public void titleTest()
    {
		String actualtitle = loginobj.titlemethod();
		Assert.assertEquals(actualtitle, "Post your Property - Login | Keralaproperty");
    }

}
