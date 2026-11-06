package testpkg;

import org.testng.annotations.Test;

import basepkg.KeralaBaseClass;

public class KeralaHomeTest extends KeralaBaseClass {

    @Test
    public void homeTest()
    {
        homeobj.addproperty_mthd();

        homeobj.details_method();

        homeobj.iframe_method();
    }
}