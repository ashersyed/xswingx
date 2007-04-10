package org.jdesktop.xswingx;

import java.awt.Color;

import javax.swing.JFormattedTextField;

import org.jdesktop.xswingx.PromptSupport.FocusBehavior;
import org.jdesktop.xswingx.plaf.PromptTextFieldUI;


/**
 * {@link JFormattedTextField}, which wraps the default UI class into a
 * {@link PromptTextFieldUI} and provides convenience methods for getting and
 * setting label properties supported by {@link PromptSupport}.
 * 
 * @author Peter Weishapl <petw@gmx.net>
 * 
 */
public class JXFormattedPromptField extends JFormattedTextField {
	public JXFormattedPromptField() {
		this(null);
	}

	public JXFormattedPromptField(String labelText) {
		this(labelText, null);
	}

	public JXFormattedPromptField(String labelText, Color labelTextColor) {
		PromptSupport.install(labelText, labelTextColor, this);
	}

	/**
	 * @see PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
	 */
	public FocusBehavior getFocusBehavior() {
		return PromptSupport.getFocusBehavior(this);
	}

	/**
	 * @see PromptSupport#getPrompt(javax.swing.text.JTextComponent)
	 */
	public String getPrompt() {
		return PromptSupport.getPrompt(this);
	}

	/**
	 * @see PromptSupport#getPromptColor(javax.swing.text.JTextComponent)
	 */
	public Color getPromptColor() {
		return PromptSupport.getPromptColor(this);
	}

	/**
	 * @see PromptSupport#getPromptFontStyle(javax.swing.text.JTextComponent)
	 */
	public Integer getPromptFontStyle() {
		return PromptSupport.getPromptFontStyle(this);
	}

	/**
	 * @see PromptSupport#getFocusBehavior(javax.swing.text.JTextComponent)
	 */
	public void setFocusBehavior(FocusBehavior focusBehavior) {
		PromptSupport.setFocusBehavior(focusBehavior, this);
	}

	/**
	 * @see PromptSupport#setPrompt(String,
	 *      javax.swing.text.JTextComponent)
	 */
	public void setPrompt(String labelText) {
		PromptSupport.setPrompt(labelText, this);
	}

	/**
	 * @see PromptSupport#setPromptColor(Color,
	 *      javax.swing.text.JTextComponent)
	 */
	public void setPromptColor(Color labelTextColor) {
		PromptSupport.setPromptColor(labelTextColor, this);
	}

	/**
	 * @see PromptSupport#setPromptFontStyle(Integer,
	 *      javax.swing.text.JTextComponent)
	 */
	public void setPromptFontStyle(Integer fontStyle) {
		PromptSupport.setPromptFontStyle(fontStyle, this);
	}
}
