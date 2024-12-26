package org.example.reteasocializare;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.example.reteasocializare.Domain.Utilizator;
import org.example.reteasocializare.Service.Network;
import org.example.reteasocializare.Utils.Events.UtilizatorEvent;
import org.example.reteasocializare.Utils.Observer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class NewFriendsController implements Observer<UtilizatorEvent> {
    private Network network;
    private Utilizator utilizator;
    ObservableList<Utilizator> model = FXCollections.observableArrayList();;

    @FXML
    TableView<Utilizator> tableView;

    @FXML
    TableColumn<Utilizator, String> columnNume;

    @FXML
    TableColumn<Utilizator, String> columnPrenume;

    @FXML
    Button buttonSendFriendRequest;

    @FXML
    Button buttonGoBack;

    @FXML
    public void initialize() {
        columnNume.setCellValueFactory(new PropertyValueFactory<Utilizator, String>("Nume"));
        columnPrenume.setCellValueFactory(new PropertyValueFactory<Utilizator, String>("Prenume"));
        tableView.setItems(model);
    }


    public void initModel() {
        Iterable<Utilizator> utilizatori = network.getNewFriendsForUtilizator(utilizator);
        List<Utilizator> utilizatoriList = StreamSupport.stream(utilizatori.spliterator(), false)
                .collect(Collectors.toList());
        model.setAll(utilizatoriList);
    }


    public void handleSendFriendRequest() {
        Utilizator selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            network.sendFriendRequest(utilizator, selected);
            initModel();
        }
    }

    public void handleGoBack() {
        network.removeObserver(this);
        Stage stage = (Stage) buttonGoBack.getScene().getWindow();
        stage.close();
        System.out.println("Back to menu");
    }


    @Override
    public void update(UtilizatorEvent utilizatorEvent) {
        initModel();
    }

    public void setNetwork(Network network, Utilizator utilizator) {
        this.network = network;
        this.utilizator = utilizator;
        network.addObserver(this);
        initModel();
    }

}
