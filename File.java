package com.Rohith;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File{
    public String[][] array;
    public int row;
    public  int col;
    public int firstcol;
    public List<String[]> lines;
    public void read() {
        String file ="src\\Attendance.csv";
        BufferedReader reader = null;
        String thisline;
        try{
            lines = new ArrayList<String[]>();
            reader = new BufferedReader(new FileReader(file));
            while ((thisline = reader.readLine()) != null) {
                lines.add(thisline.split(","));
            }
            array = new String[lines.size()][0];
            lines.toArray(array);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            firstcol = array[0].length;
            row = array.length;
            //this is 5 because the first col has lesser than other col
            col = array[5].length;
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

