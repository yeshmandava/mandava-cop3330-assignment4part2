package ucf.assignments;

import org.junit.jupiter.api.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

import javax.annotation.processing.SupportedAnnotationTypes;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class AppendTodoFileTest
{

    private final String originalPath = System.getProperty("user.home");
    private String fileDirectory = "Hey";
    private String fileName = "testFile";

    @Test
    void FileName()
    {
        assertEquals("testFile", fileName);
    }

    @Test
    void initFile()
    {
        this.fileName = "SecondFile";
        assertEquals("SecondFile",fileName);
    }

    private String[] data = new String[1];
    @Test
    void loadFile()
    {
        data[0] = "hii";

        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(Path.of(fileDirectory+"/"+fileName)));
            outputStream.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File fileC = new File(String.valueOf(Path.of(fileDirectory + "/" + fileName)));
        fileC.delete();
    }

    @Test
    void returnFileDirec()
    {
        assertEquals("Hey", fileDirectory);
        assertEquals(fileDirectory,originalPath);
    }

    @Test
    void initFilePath()
    {
        this.fileDirectory = "/Users/coolStuff";
        assertEquals("/Users/coolStuff", fileDirectory);
    }


}