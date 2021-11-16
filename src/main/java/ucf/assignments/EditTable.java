package ucf.assignments;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

public class EditTable {


    public void AdjustDate(TableColumn<Input, String> dateColumn) {

        dateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        dateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        dateColumn.setOnEditCommit(
                (javafx.scene.control.TableColumn.CellEditEvent<Input, String> t) ->
                        (t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setDueDate(t.getNewValue())
        );

    }

    public void AdjustText(TableColumn<Input, String> textColumn) {

        textColumn.setCellValueFactory(new PropertyValueFactory<>("todoText"));
        textColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        textColumn.setOnEditCommit(
                (javafx.scene.control.TableColumn.CellEditEvent<Input, String> t) ->
                        (t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).limitInput(t.getNewValue())
        );

    }

    public void AdjustStatus(TableColumn<Input, Boolean> boolColumn) {

        boolColumn.setCellValueFactory(new PropertyValueFactory<>("bool"));
        boolColumn.setCellFactory(ComboBoxTableCell.forTableColumn(true, false));
        boolColumn.setOnEditCommit(
                (javafx.scene.control.TableColumn.CellEditEvent<Input, Boolean> t) ->
                        (t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setBool(t.getNewValue())
        );

    }

}