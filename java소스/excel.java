package BuffereaExam;
import java.io.File;
import java.io.IOException;
 
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
 
public class excel {
	public static void main(String[] args) {
		// ���� ��ü ���� - �������� ���
        File file = new File("C:\\test.xls");	
        try {
            // �������� ��ũ�� ��ü ����
            Workbook workbook = Workbook.getWorkbook(file) ;
            // ��Ʈ ����
            Sheet sheet = workbook.getSheet(0);
            // �� ����
            int endIdx = sheet.getColumn(1).length-1;
            for(int i=0; i <= endIdx; i++){
                // ù��° ��(A)
                String name = sheet.getCell(0, i).getContents() ;
                // �ι�° ��(B)
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

