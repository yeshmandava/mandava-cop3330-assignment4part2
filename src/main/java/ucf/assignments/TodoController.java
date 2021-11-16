package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TodoController {


    @FXML
    private TableView<Input> table;
    @FXML
    private ObservableList<Input> dataTemp;
    @FXML
    private ObservableList<Input> data;

    @FXML
    private TextField todoInput;
    @FXML
    private DatePicker selectDueDate;

    @FXML
    private TableColumn<Input, String> dueDateSection;
    @FXML
    private TableColumn<Input, Boolean> completedColumn;
    @FXML
    private TableColumn<Input, String> todoDescription;

    @FXML
    private AppendTodoFile manage;
    @FXML
    private FileChooser fileC;



    @FXML
    public void initialize() {

        fileC = new FileChooser();
        manage = new AppendTodoFile();

        //Allow listViewContainer to be managed/edited at any point by the user
        //.setEditable(true);
        table.setEditable(true);
        table.setPlaceholder(new Label("Hey, welcome to TodoApp!!!"));

        //Implement FXCollections
        //Use observable arrayList
        //->FXCollections.observableArrayList()
        data = FXCollections.observableArrayList();
        dataTemp = FXCollections.observableArrayList();

        //Initialize the dataPicker and set it to the current date
        selectDueDate.setValue(LocalDate.now());

        //Initialize the entry input box for user with pre-entered text
        todoInput.setText("Todo");

        //Use other class to create and set up the columns
        //Wipe columns at end to clear and export those columns to the ListViewer
        EditTable edit = new EditTable();
        edit.AdjustDate(dueDateSection);
        edit.AdjustText(todoDescription);
        edit.AdjustStatus(completedColumn);


        table.setItems(data);

        table.getColumns().clear();
        table.getColumns().addAll(dueDateSection, todoDescription, completedColumn);
    }

    @FXML
    public void AddListClick(ActionEvent actionEvent) {
        // Create a new list object when add is clicked
        //Append the list container by adding it
        //Use try and catch loop
        try {
            new TodoApp().start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void DelListClick(ActionEvent actionEvent) {
        //Clear the program of listed data
        //Use .clear()
        data.clear();
    }

    @FXML
    public void AddTaskClick(ActionEvent actionEvent) {
        //Add new task object with the values entered
        //Todolist.addTodo()
        //Append to the column
        data.add(new Input(
                selectDueDate.getValue(),
                todoInput.getText()));

        selectDueDate.setValue(LocalDate.now());
        todoDescription.setText("Todo");

    }

    public void DelTaskClick(ActionEvent actionEvent) {
        //Delete top most task
        int task = table.getSelectionModel().getSelectedIndex();
        //If a certain task is selected, then that task will be deleted
        //Todolist.delTodo()
        //Append accordingly to the column
        if (task >= 0) {
            table.getItems().remove(task);
        }
    }

    @FXML
    public void ShowCompleteClick(ActionEvent actionEvent) {
        //If boolean val of completed is 1, objects will be displayed
        //dataTemp.clear()
        //dataTemp.addAll(data);
        dataTemp.clear();
        dataTemp.addAll(data);

        dataTemp.removeIf(item -> !item.getBool());

        table.setItems(dataTemp);

    }

    @FXML
    public void ShowIncompleteClick(ActionEvent actionEvent) {
        //If boolean val of completed is 0, objects will be displayed
        //dataTemp.clear()
        //dataTemp.addAll(data);
        dataTemp.clear();
        dataTemp.addAll(data);

        dataTemp.removeIf(Input::getBool);

        table.setItems(dataTemp);
    }

    @FXML
    public void DisplayAllClick(ActionEvent actionEvent) {
        //Display all objects provided
        // .setItems(data);
        table.setItems(data);

    }

    @FXML
    public void saveFile(ActionEvent actionEvent) {
        //Create arrayList to hold values
        //path = mf.getFilePath()
        //Use .saveFile(path) to save
        //Also use fileChooser

        ArrayList<Input> inputs = new ArrayList<>(data);
        fileC.setInitialFileName(manage.FileName());
        fileC.setInitialDirectory(new File(manage.returnFileDirec()));
        File file = fileC.showSaveDialog(new Stage());

        if (file != null) {
            manage.initFile(file);
            manage.initFilePath(file);
            manage.editFile(file, inputs);
        }

    }

    @FXML
    public void loadFile(ActionEvent actionEvent) {
        //Use fileChooser to select and find filepath
        //path = mf.getFilePath()
        // Use .loadFile(path)
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(manage.returnFileDirec()));

        File file = fileChooser.showOpenDialog(null);

        if (file != null) {
            manage.initFile(file);
            manage.initFilePath(file);

            Object loadFile = manage.loadFile(file.toPath());
            data.clear();
            data.addAll((ArrayList<Input>) loadFile);
        }

    }

    @FXML
    public void Quit(ActionEvent actionEvent) {
        //Use App.stop to close window.
        //Before closing, reassure todoList was saved
        Platform.exit();
        System.exit(0);
    }
}