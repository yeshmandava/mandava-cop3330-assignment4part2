package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.util.ArrayList;


public class AppendTodoFile
{
    private String fileDirectory;
    private final String originalPath = System.getProperty("user.home");
    private String fileName;


    public AppendTodoFile() {
        // initializes the file with a default name
        //Create new TodoListArray
        // Set this.filename = default_save;
        //Create new text file
        this.fileName = "default";
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

    public String returnFileDirec() {
        //IF loop to check if filepath is empty
        //if(fileDirectory.isNotEmpty)
        // ->return that path
        //ELSE
        //->return original path
        if(fileDirectory == null)
        {
            return originalPath;
        }
        else
        {
            return fileDirectory;
        }
    }

    public void initFilePath(File file)
    {
        this.fileDirectory = file.getParent();
    }

    public Object loadFile(Path file)
    {
        //Scan in the data and return as an object
        //Implement try/catch loop
        //Try --> file from path
        //Catch --> FileNotFoundException

        try{
            ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(file));
            return inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void editFile(File file, ArrayList<Input> data)
    {
        //Take in parameters such as file and data
        //Print to new file using filepath info
        //Implement try catch loop

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(file.toPath()));
            outputStream.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}