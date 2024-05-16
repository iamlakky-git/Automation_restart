package QAevening;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTheDataFromExcel {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Laxman Gole\\OneDrive\\Desktop\\ReadExcel\\ReadDatafromexcel.xlsx");
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            for(Row row :sheet){
                for (Cell cell:row){
                    String cellvalue = cell.getStringCellValue();
                    System.out.println(cellvalue + "\t");
                }
                System.out.println();
            }

            workbook.close();
            fileInputStream.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
