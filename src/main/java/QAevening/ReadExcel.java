package QAevening;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xdgf.usermodel.XDGFStyleSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Laxman Gole\\OneDrive\\Desktop\\ReadExcel\\ReadDatafromexcel.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("user");
        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(0);
        String add = cell.getStringCellValue();
        System.out.println(add);
    }
}
