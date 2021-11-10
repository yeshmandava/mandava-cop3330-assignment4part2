package ucf.assignments;

import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */


public class Tasks
{
    public String TodoName;
    public ArrayList<Input> Todo;

    public Tasks()
    {
        //Create a new Arraylist
        //Make the Arraylist empty to be adjusted by user
        //Set the pre-decided name for the list
    }

    public String ListName()
    {
        //return name of List as a String
        return TodoName;
    }

    public void updateName(String name)
    {
        //Change the name of the list to whatever the parameter gives
        this.TodoName = name;
    }

    public void newTask()
    {
        //Add task to the todoList
        //Update the arraylist from AppendTodoList
        //ArrayList.add(new input);
    }

    public void removeTask()
    {
        //Remove a specific task from the todoList
        //ArrayList.remove(selected input);
    }

}
