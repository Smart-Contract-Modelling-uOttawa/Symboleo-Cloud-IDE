/*
 * generated by Xtext 2.22.0
 */
package symboleoide;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SymboleoideStandaloneSetup extends SymboleoideStandaloneSetupGenerated {

	public static void doSetup() {
		new SymboleoideStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
