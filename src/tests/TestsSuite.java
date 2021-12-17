package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestsDossierBancaire.class,
	TestsCompteCourant.class,
	TestsCompteEpargne.class
})

public class TestsSuite {  
	}

