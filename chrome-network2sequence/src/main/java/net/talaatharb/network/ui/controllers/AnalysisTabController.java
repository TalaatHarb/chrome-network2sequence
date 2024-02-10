package net.talaatharb.network.ui.controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.talaatharb.network.config.HelperBeans;
import net.talaatharb.network.dtos.TrafficFileRoot;
import net.talaatharb.network.models.EventModel;
import net.talaatharb.network.service.TrafficFileAnalyzerService;
import net.talaatharb.network.service.TrafficFileLoaderService;

@RequiredArgsConstructor
@Slf4j
public class AnalysisTabController implements Initializable {

	@FXML
	@Setter(value = AccessLevel.PACKAGE)
	private RadioButton hostSectionRadio;

	@FXML
	@Setter(value = AccessLevel.PACKAGE)
	private RadioButton hostContextRadio;

	@FXML
	@Setter(value = AccessLevel.PACKAGE)
	private RadioButton urlRadio;

	@FXML
	@Setter(value = AccessLevel.PACKAGE)
	private Slider startSlider;

	@FXML
	@Setter(value = AccessLevel.PACKAGE)
	private Slider endSlider;

	@FXML
	@Setter(value = AccessLevel.PACKAGE)
	private VBox actorsVbox;

	@FXML
	@Setter(value = AccessLevel.PACKAGE)
	private AnchorPane graphPane;

	private ToggleGroup toggleGroup;

	private String fileLocation;

	private final TrafficFileLoaderService trafficFileLoader;
	private final TrafficFileAnalyzerService trafficFileAnalyzer;

	public AnalysisTabController() {
		trafficFileLoader = HelperBeans.buildTrafficFileLoader(HelperBeans.buildJsonObjectMapper());
		trafficFileAnalyzer = HelperBeans.buildTrafficFileAnalizer();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		toggleGroup = new ToggleGroup();

		hostSectionRadio.setToggleGroup(toggleGroup);
		hostContextRadio.setToggleGroup(toggleGroup);
		urlRadio.setToggleGroup(toggleGroup);
	}

	public void startAnalysis(final File selectedFile) {
		fileLocation = selectedFile.getAbsolutePath();

		log.info("Analysing: " + fileLocation);

		TrafficFileRoot root = null;
		try {
			root = trafficFileLoader.loadTrafficeFile(selectedFile);
			final List<EventModel> events = trafficFileAnalyzer.analyze(root);
			log.info("Loaded: {} events", events.size());
		} catch (final IOException e) {
			log.error(e.getMessage());
		}
	}

	@FXML
	private void selectHostRadio() {
		log.info("Host");
	}

	@FXML
	private void selectHostContextRadio() {
		log.info("Context");
	}

	@FXML
	private void selectUrl() {
		log.info("URL");
	}

	@FXML
	private void selectAllEvents() {
		log.info("Select all events");
	}

	@FXML
	private void deselectAllEvents() {
		log.info("Deselect all events");
	}

}
