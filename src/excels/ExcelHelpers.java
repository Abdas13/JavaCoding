package excels;


import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

public class ExcelHelpers {
    private Sheet workSheet;
    private Workbook workbook;
    private String path;

    public ExcelHelpers(String path, String sheetName) {
        this.path = path;
        try {
            FileInputStream excelFile = new FileInputStream(path);
            workbook = WorkbookFactory.create(excelFile);
            workSheet = workbook.createSheet(sheetName);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public String getCellData(int rowNum, int columnNum){
        Cell cell;
        try {
            cell = workSheet.getRow(rowNum).getCell(columnNum);
            return cell.toString();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public int rowCount(){
        return workSheet.getLastRowNum()+1;
    }
    public int columnCount(){
        return workSheet.getRow(0).getLastCellNum();
    }

}
