package com.ipastorl.tablafx;

import com.ipastorl.tablafx.model.Capsule;
import com.ipastorl.tablafx.model.CapsulesService;
import com.ipastorl.tablafx.model.Mission;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // ObservableList

    ObservableList<Capsule> capsules;
    ObservableList<Mission> missions;

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
        // initialize ObservableList
        capsules = FXCollections.observableArrayList();
        missions = FXCollections.observableArrayList();

        final CapsulesService capsulesService = new CapsulesService();

        // Cells columns of Table View Capsule
        capsule_serial.setCellValueFactory(new PropertyValueFactory<Capsule,String>("capsule_serial"));
        capsule_id.setCellValueFactory(new PropertyValueFactory<Capsule,String>("capsule_id"));
        status.setCellValueFactory(new PropertyValueFactory<Capsule,String>("status"));
        original_launch.setCellValueFactory(new PropertyValueFactory<Capsule,String>("original_launch"));
        original_launch_unix.setCellValueFactory(new PropertyValueFactory<Capsule,Integer>("original_launch_unix"));
        landings.setCellValueFactory(new PropertyValueFactory<Capsule,Integer>("landings"));
        type.setCellValueFactory(new PropertyValueFactory<Capsule,String>("type"));
        details.setCellValueFactory(new PropertyValueFactory<Capsule,String>("details"));
        reuse_count.setCellValueFactory(new PropertyValueFactory<Capsule, Integer>("reuse_count"));

        // Table View Capsule
        capsules = capsulesService.getAllCapsules();
        tableview_spacex.setItems(capsules);

        // Cells columns of Table View Missions
        name.setCellValueFactory(new PropertyValueFactory<Mission,String>("name"));
        flight.setCellValueFactory(new PropertyValueFactory<Mission,Integer>("flight"));

        // Table View Missions
        missions = capsulesService.getAllMissions("C101");
        tableview_missions.setItems(missions);

    }
}