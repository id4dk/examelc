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
		// 竣伎颇老 按眉 积己
        WritableWorkbook workbook = null;
         
        // 矫飘 按眉 积己
        WritableSheet sheet = null;
         
        // 伎 按眉 积己
        Label label = null;
         
         
        // 历厘且 颇老 按眉 积己
        File file = new File("C:\\test02.xls");
         
         
        // 抛胶飘 单捞磐
        HashMap hm_0 = new HashMap() ;
        hm_0.put("name", "全辨悼") ;
        hm_0.put("age", "21") ;
         
        HashMap hm_1 = new HashMap() ;
        hm_1.put("name", "辫康锐") ;
        hm_1.put("age", "20") ;
         
        List list = new ArrayList();
        list.add(hm_0) ;
        list.add(hm_1) ;
         
         
        try{
             
            // 颇老 积己
            workbook = Workbook.createWorkbook(file);
             
            // 矫飘 积己
            workbook.createSheet("sheet1", 0);
            sheet = workbook.getSheet(0);
             
            // 伎俊 静扁
            label = new Label(0, 0, "name");
            sheet.addCell(label);
             
            label = new Label(1, 0, "age");
            sheet.addCell(label);
             
             
             
            // 单捞磐 火涝
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

