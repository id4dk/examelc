package BuffereaExam;
import java.io.File;
import java.io.IOException;
 
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
 
public class excel {
	public static void main(String[] args) {
		// 파일 객체 생성 - 엑셀파일 경로
        File file = new File("C:\\test.xls");	
        try {
            // 엑셀파일 워크북 객체 생성
            Workbook workbook = Workbook.getWorkbook(file) ;
            // 시트 지정
            Sheet sheet = workbook.getSheet(0);
            // 행 길이
            int endIdx = sheet.getColumn(1).length-1;
            for(int i=0; i <= endIdx; i++){
                // 첫번째 열(A)
                String name = sheet.getCell(0, i).getContents() ;
                // 두번째 열(B)
                String age = sheet.getCell(1, i).getContents() ;
                System.out.println(name + " : " + age) ;
            }
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}

