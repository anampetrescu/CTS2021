package ro.ase.cts.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestGrupa.class, TestGrupaCuFixture.class, TestGrupaWithDummy.class, TestGrupaWithFake.class,
		TestGrupaWithStub.class })
public class AllTests {

}
