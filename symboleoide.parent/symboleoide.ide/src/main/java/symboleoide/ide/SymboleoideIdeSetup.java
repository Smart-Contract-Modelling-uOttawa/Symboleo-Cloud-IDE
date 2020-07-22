/*
 * generated by Xtext 2.22.0
 */
package symboleoide.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import symboleoide.SymboleoideRuntimeModule;
import symboleoide.SymboleoideStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class SymboleoideIdeSetup extends SymboleoideStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SymboleoideRuntimeModule(), new SymboleoideIdeModule()));
	}
	
}
