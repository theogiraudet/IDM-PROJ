/*
 * generated by Xtext 2.25.0
 */
package fr.istic.idm.ui;

import com.google.inject.Injector;
import fr.istic.idm.grammar.ui.internal.GrammarActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SwagExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(GrammarActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		GrammarActivator activator = GrammarActivator.getInstance();
		return activator != null ? activator.getInjector(GrammarActivator.FR_ISTIC_IDM_SWAG) : null;
	}

}
