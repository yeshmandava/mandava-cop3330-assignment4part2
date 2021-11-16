package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

import java.io.Serializable;
import java.time.LocalDate;

public class Input implements Serializable {


    private String dueDate;
    private String todoText;
    private Boolean bool;

    public Input() {
        // set Date to blank
        // set default string to blank ""
        // set default Boolean to false
        this.dueDate = (LocalDate.now().toString());
        this.todoText = ("");
        this.bool = false;
    }

    public Input(LocalDate date, String string) {
        //Take in date info to update the due date section
        //Update the task bar by using string input parameter
        //setDueDate(date.toString());
        setDueDate(date.toString());
        limitInput(string);
        this.bool = false;
    }


    public String getDueDate() {
        //returns the date value for the task
        return dueDate;
    }

    public String getTodoText() {
        //Returns the entered task in string form
        return todoText;
    }

    public Boolean getBool() {
        //Use previous func to mark whether task is complete or not
        //this.checkComplete = bool;
        return bool;
    }


    public void setDueDate(String date) {
        //Initialize the date as this.dueDate;
        //this.dueDate = date;
        this.dueDate = date;
    }

    public void limitInput(String input) {
        //Limit the user from putting more than 256 char in text bar
        //If greater it will cut to only 256
        //String.substring(0,256);
        if (input.length() > 256) {
            this.todoText = input.substring(0, 256);}
        else {
            this.todoText = input;
        }
    }

    public void setBool(Boolean bool) {
        // set value based off of boolean parameter
        // this.setCompleted = bool
        this.bool = bool;
    }


}