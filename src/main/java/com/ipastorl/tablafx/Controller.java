package com.ipastorl.tablafx;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // ObservableList
    Capsule capsule;
    List<Capsule> capsules;
    List<Mission> missions;

    // Containers

    @FXML // fx:id="main_container"
    private Pane main_container; // Value injected by FXMLLoader

    // Buttons

    @FXML // fx:id="btn_missions"
    private Button btn_missions; // Value injected by FXMLLoader

    @FXML // fx:id="btn_spacex"
    private Button btn_spacex; // Value injected by FXMLLoader

    // Table Views

    @FXML // fx:id="tableview_spacex"
    private TableView<Capsule> tableview_spacex; // Value injected by FXMLLoader

    @FXML // fx:id="tableview_missions"
    private TableView<Mission> tableview_missions; // Value injected by FXMLLoader


    // Columns Capsule

    @FXML // fx:id="capsule_id"
    private TableColumn<Capsule, String> capsule_id; // Value injected by FXMLLoader

    @FXML // fx:id="capsule_serial"
    private TableColumn<Capsule, String> capsule_serial; // Value injected by FXMLLoader

    @FXML // fx:id="details"
    private TableColumn<Capsule, String> details; // Value injected by FXMLLoader

    @FXML // fx:id="landings"
    private TableColumn<Capsule, Integer> landings; // Value injected by FXMLLoader

    @FXML // fx:id="original_launch"
    private TableColumn<Capsule, String> original_launch; // Value injected by FXMLLoader

    @FXML // fx:id="original_launch_unix"
    private TableColumn<Capsule, Integer> original_launch_unix; // Value injected by FXMLLoader

    @FXML // fx:id="reuse_count"
    private TableColumn<Capsule, Integer> reuse_count; // Value injected by FXMLLoader

    @FXML // fx:id="status"
    private TableColumn<Capsule, String> status; // Value injected by FXMLLoader

    @FXML // fx:id="type"
    private TableColumn<Capsule, String> type; // Value injected by FXMLLoader

    // Columns Mission

    @FXML // fx:id="name"
    private TableColumn<Mission, String> name; // Value injected by FXMLLoader

    @FXML // fx:id="flight"
    private TableColumn<Mission, Integer> flight; // Value injected by FXMLLoader

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  {@code null} if the location is not known.
     * @param resources The resources used to localize the root object, or {@code null} if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    public void onClickSpaceX(ActionEvent actionEvent) {
        // Cells columns of Table View Capsule
        capsule_serial.setCellValueFactory(new PropertyValueFactory<Capsule,String>("capsuleSerialC"));
        capsule_id.setCellValueFactory(new PropertyValueFactory<Capsule,String>("capsuleIdC"));
        status.setCellValueFactory(new PropertyValueFactory<Capsule,String>("statusC"));
        original_launch.setCellValueFactory(new PropertyValueFactory<Capsule,String>("originalLaunchC"));
        original_launch_unix.setCellValueFactory(new PropertyValueFactory<Capsule,Integer>("originalLaunchunixC"));
        landings.setCellValueFactory(new PropertyValueFactory<Capsule,Integer>("landingsC"));
        type.setCellValueFactory(new PropertyValueFactory<Capsule,String>("typeC"));
        details.setCellValueFactory(new PropertyValueFactory<Capsule,String>("detailsC"));
        reuse_count.setCellValueFactory(new PropertyValueFactory<Capsule, Integer>("reuseCountC"));

        // Table View Capsule
        capsules = (new CapsuleList()).getCapsuleList();

        // Convert List to ObservableList (Capsule)
        ObservableList<Capsule> capsulesList = FXCollections.observableList(capsules);
        tableview_spacex.setItems(capsulesList);

    }

    public void onClickMissions(ActionEvent actionEvent) {

        // if item selected is not empty
        if(!tableview_spacex.getSelectionModel().isEmpty()) {

            // capsule selected in tableview SpaceX
            capsule = tableview_spacex.getSelectionModel().getSelectedItem();
            String capsuleSerial = capsule.getCapsuleSerialC();

            // Cells columns of Table View Missions
            name.setCellValueFactory(new PropertyValueFactory<Mission,String>("nameM"));
            flight.setCellValueFactory(new PropertyValueFactory<Mission,Integer>("flightM"));

            // missions = capsulesService.getMissions();
            missions = (new CapsuleList()).getMissionList(capsuleSerial);

            // Convert List to ObservableList (Mission)
            ObservableList<Mission> missionsList = FXCollections.observableList(missions);
            tableview_missions.setItems(missionsList);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debe seleccionar antes una cápsula de la lista Space X");
            alert.showAndWait();

        }


    }
}