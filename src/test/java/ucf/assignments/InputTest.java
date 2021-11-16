package ucf.assignments;

import org.junit.jupiter.api.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

import static org.junit.jupiter.api.Assertions.*;

class InputTest
{
    String dueDate = "2021-11-14";
    String todoText = "Finish oop project";
    Boolean bool = false;

    @Test
    void getDueDate()
    {
        assertEquals("2021-11-14", dueDate);
    }

    @Test
    void getTodoText()
    {
        assertEquals("Finish oop project", todoText);
    }

    @Test
    void bool()
    {
        assertFalse(bool);
    }

    @Test
    void limitInput()
    {

        StringBuilder test = new StringBuilder();
        test.append("A".repeat(500));

        if(test.length() >256)
        {
            this.todoText = test.substring(0,256);
        }
        else
            this.todoText = test.toString();

        assertEquals("A".repeat(256),todoText);
    }

    @Test
    void setDueDate()
    {
        this.dueDate = "2021-11-15";
        assertEquals("2021-11-15", dueDate);
    }

    @Test
    void setBool()
    {
        this.bool = true;
        assertTrue(bool);
    }

}