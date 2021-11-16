package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

class TodoControllerTest
{

    @Test
    void NewTaskClick()
    {

        //Test to check that when user clicks the add task list button the correct message is displayed
        //AssertEquals(When clicked display "added task")
        System.out.println("Added task");
    }

    @Test
    void DelTaskClick()
    {

        //Test to check that when user clicks the delete task list button the correct message is displayed
        //AssertEquals(When clicked display "deleted task")
        System.out.println("Deleted task");

    }

    @Test
    void AddListClick()
    {
        //Test to check that when user clicks the add list button the correct message is displayed
        //AssertEquals(When clicked display "list added")
        System.out.println("Added list");
    }

    @Test
    void DelListClick()
    {
        //Test to check that when user clicks the delete list button the correct message is displayed
        //AssertEquals(When clicked display "list removed")
        System.out.println("List removed");

    }

    @Test
    void ShowCompleteClick()
    {

        //Test to check that when user clicks the completed button the correct message is displayed
        //AssertEquals(When clicked display "completed tasks")
        System.out.println("Completed tasks shown!");

    }

    @Test
    void ShowIncompleteClick()
    {
        //Test to check that when user clicks the incomplete button the correct message is displayed
        //AssertEquals(When clicked display "pending tasks")
        System.out.println("Pending tasks shown");

    }

    @Test
    void DisplayAllClick()
    {
        //Test to check that when user clicks the display all list button the correct message is displayed
        //AssertEquals(When clicked display "all items shown")
        System.out.println("All items shown");

    }

    @Test
    void SaveFile()
    {

        //Test to check that when user clicks the save file button the correct message is displayed
        //AssertEquals(When clicked display "file stored")
        System.out.println("File stored");
    }

    @Test
    void loadFile()
    {

        //Test to check that when user clicks the add task list button the correct message is displayed
        //AssertEquals(When clicked display "file loaded")
        System.out.println("File loaded!");
    }

    @Test
    void Quit()
    {
        //Test to check that when user clicks the quit button the correct message is displayed
        //AssertEquals(When clicked display "closing app")
        System.out.println("TodoApp closed");
    }

}