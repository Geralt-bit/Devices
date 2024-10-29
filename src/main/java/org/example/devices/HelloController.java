
package org.example.devices;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {


    @FXML
    private TextField textName;

    @FXML
    private TextField textPrice;

    @FXML
    private TextField textWeight;

    @FXML
    private TextField textScreenSize;

    @FXML
    private TextField textResolution;

    @FXML
    private TextField textRam;

    @FXML
    private TextField textProcessor;

    @FXML
    private ListView<Device> listView;

    @FXML
    private TextField textStylus;

    @FXML
    private TextField textButtery;

    @FXML
    ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        listView.setItems(devices);
    }

    @FXML
    private Label label;

    @FXML
    protected void onListClicked(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText(devices.get(id).toString());

    }

    @FXML
    private void onRemoveClick(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText( devices.get(id).getName() + " is removed." );
        devices.remove(id);
    }

    @FXML
    private TabPane tabPane;

    @FXML
    void onAddClick(ActionEvent event) {
        Tab selectedTab = tabPane.getSelectionModel().getSelectedItem();

        if (selectedTab.getText().equals("Smartphone")) {
            Smartphone sm = new Smartphone();
            sm.setName(textName.getText());
            sm.setType(DeviceType.SMARTPHONE);
            sm.setPrice(Double.parseDouble(textPrice.getText()));
            sm.setWeight(Double.parseDouble(textWeight.getText()));
            sm.setScreenSize(Integer.parseInt(textScreenSize.getText()));
            sm.setResolution(Integer.parseInt(textResolution.getText()));
            devices.add(sm);
        }

        if (selectedTab.getText().equals("Laptop")) {
            Laptop lp = new Laptop();
            lp.setName(textName.getText());
            lp.setType(DeviceType.LAPTOP);
            lp.setPrice(Double.parseDouble(textPrice.getText()));
            lp.setWeight(Double.parseDouble(textWeight.getText()));
            lp.setRamSize(Integer.parseInt(textRam.getText()));
            lp.setProcessorType(textProcessor.getText());
            devices.add(lp);
        }

        if (selectedTab.getText().equals("Tablet")) {
            Tablet tb = new Tablet();
            tb.setName(textName.getText());
            tb.setType(DeviceType.TABLET);
            tb.setPrice(Double.parseDouble(textPrice.getText()));
            tb.setWeight(Double.parseDouble(textWeight.getText()));
            tb.setButteryLife(Double.parseDouble(textButtery.getText()));
            String stylusInput = textStylus.getText().trim().toLowerCase();
            tb.setHasStylus(stylusInput.equals("yes"));
            devices.add(tb);
        }
    }
}
