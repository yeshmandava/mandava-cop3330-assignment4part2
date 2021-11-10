package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

import java.nio.file.Path;
import java.io.File;
import java.util.ArrayList;


public class AppendTodoFile
{
    private String fileDirectory;
    private final String originalPath = System.getProperty("user.home");
    private String fileName;


    public void AppendFile() {
        // initializes the file with a default name
        //Create new TodoListArray
        // Set this.filename = default_save;
        //Create new text file
    }

    public String FileName()
    {
        //return the filename in string format
        return fileName;
    }

    public void initFile(File file)
    {
        // Set this.filename to fileName
        this.fileName = file.getName();
    }

    public Path returnFileDirec() {
        //IF loop to check if filepath is empty
        //if(fileDirectory.isNotEmpty)
        // ->return that path
        //ELSE
        //->return original path
        return Path.of(fileDirectory);
    }

    public void initFilePath(File file)
    {
        //this.fileDirectory = file.getParent();
    }

    public void loadFile(File file)
    {
        //Scan in the data and return as an object
        //Implement try/catch loop
        //Try --> file from path
        //Catch --> FileNotFoundException
    }

    public void editFile(File file, ArrayList<Input> data)
    {
        //Take in parameters such as file and data
        //Print to new file using filepath info
        //Implement try catch loop
    }

    public void saveList()
    {
        //Save the file in correct format to filePath
    }

}