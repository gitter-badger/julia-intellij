package org.ice1000.julia.lang.module;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.components.labels.LinkLabel;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public abstract class JuliaSetupSdkWizardStep extends ModuleWizardStep {
	protected @NotNull JPanel mainPanel;
	protected @NotNull LinkLabel<Object> juliaWebsite;
	protected @NotNull JLabel usefulText;
	protected @NotNull TextFieldWithBrowseButton juliaExeField;
	protected @NotNull TextFieldWithBrowseButton importPathField;
}
