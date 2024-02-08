package net.talaatharb.network.ui.controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.FileChooser;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class MainWindowUiController implements Initializable {

	private static final String ANALYSIS_TAB_FXML = "../AnalysisTab.fxml";

	@FXML
	@Setter(value = AccessLevel.PACKAGE)
	private TabPane tabPane;

	@FXML
	void loadTrafficFile() {
		log.info("Loading traffic file...");
		final var currentWindow = tabPane.getScene().getWindow();
		final FileChooser fileChooser = new FileChooser();
		final File selectedFile = fileChooser.showOpenDialog(currentWindow);

		final FXMLLoader loader = new FXMLLoader(getClass().getResource(ANALYSIS_TAB_FXML));
		try {

			final Parent tabContents = loader.load();
			final AnalysisTabController tabContentsController = loader.getController();

			final Tab newAnalysisTab = new Tab();
			newAnalysisTab.setClosable(true);

			newAnalysisTab.setText(selectedFile.getName());

			newAnalysisTab.setContent(tabContents);
			tabPane.getTabs().add(newAnalysisTab);

			tabPane.getSelectionModel().select(newAnalysisTab);

			tabContentsController.startAnalysis(selectedFile);

		} catch (final IOException ex) {
			log.error(ex.getMessage());
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		log.info("Initializing UI application Main window controller...");
	}

}
