/*
 * generated by Xtext
 */
package org.jastemf.siple.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SipleUiModule extends org.jastemf.siple.ui.AbstractSipleUiModule {
	public SipleUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	 public Class<? extends XtextEditor> bindEditor() {
		    return PropertiesViewAwareEditor.class;
		  }
	
}
