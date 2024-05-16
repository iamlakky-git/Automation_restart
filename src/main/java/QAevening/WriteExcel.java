package QAevening;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel{

    public static void main(String[] args) throws IOException {
        String path1 =System.getProperty("user.dir")+ File.separator + "TestData"+File.separator +"TestData.pdf";
        String path = "C:\\Users\\Laxman Gole\\OneDrive\\Desktop\\ReadExcel2\\Dataset1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("credentials");

        for (int i=1;i<=sheet.getLastRowNum();i++){
            Row row = sheet.getRow(i);
            Cell cell = row.createCell(2);
            cell.setCellValue("pass");

        }
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }

}
