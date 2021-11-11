package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

import java.io.Serializable;
import java.time.LocalDate;

public class Input implements Serializable
{


    private String dueDate;
    private String todoTask;
    private Boolean bool;

    public Input() {
        // set Date to blank
        // set default string to blank ""
        // set default Boolean to false
        this.dueDate = (LocalDate.now().toString());
        this.todoTask = (" ");
        this.bool = false;

    }

    public Input(LocalDate date, String string)
    {
        //Take in date info to update the due date section
        //Update the task bar by using string input parameter
        //setDueDate(date.toString());
    }

    public String getDate()
    {
        //returns the date value for the task
        return dueDate;
    }

    public void setDueDate(String chosenDate)
    {
        //Initialize the date as this.dueDate;
        //this.dueDate = date;
        this.dueDate = chosenDate;
    }

    public String getTask()
    {
        //Returns the entered task in string form
        return todoTask;
    }

    public void markComplete(Boolean done)
    {
        //Use previous func to mark whether task is complete or not
        //this.checkComplete = bool;
        this.bool = done;
    }

    public void limitInput(String input)
    {
        //Limit the user from putting more than 256 char in text bar
        //If greater it will cut to only 256
        //String.substring(0,256);

        if(input.length() >256) {
            this.todoTask = input.substring(0, 256);
        }
        else
            this.todoTask = (input);
    }

}
