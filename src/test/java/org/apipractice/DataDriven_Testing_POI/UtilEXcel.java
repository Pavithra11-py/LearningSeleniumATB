package org.apipractice.DataDriven_Testing_POI;

import org.apache.poi.ss.usermodel.*;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilEXcel {

    // Apache POI
    // Read the File - TestData.xlsX
    //  Workbook Create
    // Sheet
    // Row and Cell
    // 2D Object  - getData()

    // File -> Workbook -> Sheet-> Row -> cell -> [][]

    static Workbook book;
    static Sheet sheet;

    public static String  Sheet_PATH = System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx";

    public static Object[][] getDatafromExcel(String sheetName)
    {
        FileInputStream file = null;
        try {
       //checked exception so surround in try catch
            FileInputStream input  = new FileInputStream(Sheet_PATH);
            book = WorkbookFactory.create(file); // here its reading the input data and memorizing not creating a file
        // we need to convert static file into Stream so that JVM can read it

            sheet = book.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println("File not found or Workbook not created !");
        }

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
       // Object[][] data = new Object[5][2];      --> hardcode

        for(int i=0;i<sheet.getLastRowNum();i++){
          for(int j=0; j<sheet.getRow(0).getLastCellNum();j++){

              data[i][j] = sheet.getRow(i+1).getCell(j).toString();

          }

        }

      return data;


    }




}
