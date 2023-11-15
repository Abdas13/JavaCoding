package excels;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelExample {

    private String path;
    private Workbook workbook;
    private Sheet sheet;

    public ExcelExample(String sheetName) {

        String path = "src/excels/Infos.xlsx";
        try {
            FileInputStream excelFile = new FileInputStream(path);
            workbook = WorkbookFactory.create(excelFile);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {

        try {
            ExcelExample exc = new ExcelExample("SheetInfo");

            System.out.println(exc.sheet.getRow(3).getCell(1));
            System.out.println(exc.sheet.getLastRowNum());
            System.out.println(exc.sheet.getRow(0).getLastCellNum());
            System.out.println(exc.sheet.getHeader());
            System.out.println(exc.sheet.getRow(2).getCell(1));


//            Row row1 = exc.sheet.createRow(0);
//            row1.createCell(1).setCellValue("ID");
//            row1.createCell(2).setCellValue("Name");
//            Row row2 = exc.sheet.createRow(1);
//            row2.createCell(1).setCellValue(33);
//            row2.createCell(2).setCellValue("Jan");
//
//            System.out.println(row2.getCell(1).toString());
//            System.out.println(row2.iterator().hasNext());

            for (int i = 1; i <exc.sheet.getRow(0).getLastCellNum() ; i++) {
                for (int j = 0; j < exc.sheet.getLastRowNum(); j++) {
                    System.out.print(exc.sheet.getRow(i).getCell(j)+", ");
                }

            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println(columnData(3));
    }
    public static List<String> columnData(int columnNumber){
        List<String> columnDatas = new ArrayList<>();
        try {
            ExcelExample exc = new ExcelExample("SheetInfo");

            for (int i = 1; i < exc.sheet.getLastRowNum()+1; i++) {
                String data=exc.sheet.getRow(i).getCell(columnNumber).toString();
                columnDatas.add(data);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return columnDatas;
    }
}
