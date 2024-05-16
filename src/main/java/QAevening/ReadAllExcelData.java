package QAevening;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadAllExcelData {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Laxman Gole\\OneDrive\\Desktop\\ReadExcel\\ReadDatafromexcel.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("user");

        int rowCount = sheet.getLastRowNum();
        System.out.println("total lasts Row  count ==" + rowCount);

        for (int i=1;i<rowCount;i++){
            int cellCount =  sheet.getRow(i).getLastCellNum();
            System.out.println("The total column =="+cellCount);

            for (int j=0;j< cellCount;j++){
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue() + ",");
            }
        }
    }
}
