package BuffereaExam;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class excel02 {
	public static void main(String[] args) {
		// �������� ��ü ����
        WritableWorkbook workbook = null;
         
        // ��Ʈ ��ü ����
        WritableSheet sheet = null;
         
        // �� ��ü ����
        Label label = null;
         
         
        // ������ ���� ��ü ����
        File file = new File("C:\\test02.xls");
         
         
        // �׽�Ʈ ������
        HashMap hm_0 = new HashMap() ;
        hm_0.put("name", "ȫ�浿") ;
        hm_0.put("age", "21") ;
         
        HashMap hm_1 = new HashMap() ;
        hm_1.put("name", "�迵��") ;
        hm_1.put("age", "20") ;
         
        List list = new ArrayList();
        list.add(hm_0) ;
        list.add(hm_1) ;
         
         
        try{
             
            // ���� ����
            workbook = Workbook.createWorkbook(file);
             
            // ��Ʈ ����
            workbook.createSheet("sheet1", 0);
            sheet = workbook.getSheet(0);
             
            // ���� ����
            label = new Label(0, 0, "name");
            sheet.addCell(label);
             
            label = new Label(1, 0, "age");
            sheet.addCell(label);
             
             
             
            // ������ ����
            for(int i=0; i < list.size(); i++){
                HashMap rs = (HashMap)list.get(i) ;
                 
                label = new Label(0, (i+1), (String)rs.get("name"));
                sheet.addCell(label);
                 
                label = new Label(1, (i+1), (String)rs.get("age"));
                sheet.addCell(label);
                 
            }
             
             
            workbook.write();
            workbook.close();
 
        }catch(Exception e){
            e.printStackTrace();
        }
         
 
    }
 




	}

