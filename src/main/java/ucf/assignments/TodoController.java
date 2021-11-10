package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class TodoController {

    @FXML
    private ListView<Tasks> listViewContainer;
    @FXML
    private ObservableList<Tasks> data;
    @FXML
    private ObservableList<Tasks> dataTemp;
    @FXML
    private DatePicker selectDueDate;
    @FXML
    private TextField todoInput;
    @FXML
    private TableColumn<Tasks, LocalDate> dueDateColumn;
    @FXML
    private TableColumn<Tasks, String> todoDescriptionColumn;
    @FXML
    private TableColumn<Tasks, Boolean> completedColumn;
    @FXML
    private AppendTodoFile manage;

    @FXML
    public void Init() {

        //Allow listViewContainer to be managed/edited at any point by the user
        //.setEditable(true);

        //Implement FXCollections
        //Use observable arrayList
        //->FXCollections.observableArrayList()

        //Initialize the dataPicker and set it to the current date
        //Initialize the entry input box for user with pre-entered text

        //Use other class to create and set up the columns
        //Wipe columns at end to clear and export those columns to the ListViewer

    }

    @FXML
    public void AddListClick(ActionEvent actionEvent) {
        // Create a new list object when add is clicked
        //Append the list container by adding it
    }

    @FXML
    public void DelListClick(ActionEvent actionEvent) {
        //Clear the program of listed data
        //Use .clear()
    }

    @FXML
    public void DisplayAllClick(ActionEvent actionEvent) {
        //Display all objects provided
        // .setItems(data);
    }

    @FXML
    public void ShowCompleteClick(ActionEvent actionEvent) {
        //If boolean val of completed is 1, objects will be displayed
        //dataTemp.clear()
        //dataTemp.addAll(data);
    }

    @FXML
    public void ShowIncompleteClick(ActionEvent actionEvent) {
        //If boolean val of completed is 0, objects will be displayed
        //dataTemp.clear()
        //dataTemp.addAll(data);
    }


    @FXML
    public void NewTaskClick(ActionEvent actionEvent) {
        //Add new task object with the values entered
        //Todolist.addTodo()
        //Append to the column
    }

    @FXML
    public void DelTaskClick(ActionEvent actionEvent) {
        //Delete top most task
        //If a certain task is selected, then that task will be deleted
        //Todolist.delTodo()
        //Append accordingly to the column
    }

    @FXML
    public void saveFile(ActionEvent actionEvent) {
        //Create arrayList to hold values
        //path = mf.getFilePath()
        //Use .saveFile(path) to save
        //Also use fileChooser
    }

    @FXML
    public void loadFile(ActionEvent actionEvent) {
        //Use fileChooser to select and find filepath
        //path = mf.getFilePath()
        // Use .loadFile(path)
    }

    @FXML
    public void saveList(ActionEvent actionEvent) {
        //path = mf.getFilePath()
        //String n = mf.getFileName()
        // Use mf.saveList(path,n);
    }

    @FXML
    public void loadList(ActionEvent actionEvent) {
        //path = mf.getFilePath()
        //String n = mf.getFileName()
        // Use mf.loadList(path,n)
    }

    @FXML
    public void Quit(ActionEvent actionEvent) {
        //Use App.stop to close window.
        //Before closing, reassure todoList was saved
    }

}