package testDataGenerators;

import com.github.javafaker.Faker;
import jline.internal.Log;
import net.thucydides.core.annotations.Step;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestDataGenerator {
    Faker faker = new Faker();

    public void writeToExcel() throws IOException {
        Log.info("Writing test data to excel file");
        File testDataFile = new File("/src/test/resources/testDataFiles/testData.xlsx");
        FileInputStream inputStream = new FileInputStream(testDataFile);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("TestData");

        if (sheet.getLastRowNum() > 0) {
            for (int i = 1; i < sheet.getLastRowNum(); i++) {
                sheet.removeRow(sheet.getRow(i));
            }
        }

        for (int i = 1; i < 6; i++)

        {
            sheet.createRow(i).createCell(0).setCellValue(faker.name().fullName());
            sheet.createRow(i).createCell(1).setCellValue(faker.internet().emailAddress());
            sheet.createRow(i).createCell(2).setCellValue(faker.internet().password(8, 15));
        }


    }
}
