package BuffereaExam;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
 




public class excel04 {
	public static void main(String[] args) {
		HSSFWorkbook workBook;
	    String filePath;
	    String excelFileName;
	     
	    /*
	     * ȣ�� �޼ҵ�
	     * writeData(filePath, fileName, ObjectList);
	     */
	    public void writeData(String filePath1, String fileName, List<user> userList){
	        this.filePath = filePath1;
	        excelFileName = fileName + ".xls";
	        try {
	            FileOutputStream fout = setFile(filePath1, excelFileName);
	            HSSFWorkbook workBook = createExcel(userList);
	            workBook.write(fout);
	            fout.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	     
	    /*
	     * �ٽ� ���μ���
	     */
	    public HSSFWorkbook createExcel(List<user> userList){
	        // Excel Write
	        workBook = new HSSFWorkbook();
	        HSSFSheet sheet = workBook.createSheet("UserList");
	         
	        // ## Font Setting
	        // @HSSFFont : ��Ʈ ����
	        //  - FONT_ARIAL : �⺻
	        HSSFFont font = workBook.createFont();
	        font.setFontName(HSSFFont.FONT_ARIAL);
	         
	        // ## Title Style Setting
	        // @HSSFColor : �� ����
	        //  - GREY_$_PERCENT : ȸ�� $ �ۼ�Ʈ
	        // @HSSFCellStyle
	        //  - ALIGN_$ : $ �� ����
	        HSSFCellStyle titleStyle = workBook.createCellStyle();
	        titleStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
	        titleStyle.setFillPattern(HSSFCellStyle.ALIGN_LEFT);
	        titleStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
	        titleStyle.setFont(font);
	         
	        // ## Row Create
	        // ? ���ο� ����
	        HSSFRow row = sheet.createRow((short)0);
	         
	        // ## Title Cell Create
	        // @row.createCell((short)n) : n��° �� ����
	        // @setCellValue(String) : n ��° ���� ����
	        // @setCellStyle(style) : n ��° ���� ��Ÿ��
	        HSSFCell cell_0 = row.createCell((short)0);
	        cell_0.setCellValue("��ȣ");
	        cell_0.setCellStyle(titleStyle);
	         
	        HSSFCell cell_1 = row.createCell((short)1);
	        cell_1.setCellValue("E-Mail");
	        cell_1.setCellStyle(titleStyle);
	         
	        HSSFCell cell_2 = row.createCell((short)2);
	        cell_2.setCellValue("Password");
	        cell_2.setCellStyle(titleStyle);
	         
	        HSSFCell cell_3 = row.createCell((short)3);
	        cell_3.setCellValue("Name");
	        cell_3.setCellStyle(titleStyle);
	         
	        HSSFCell cell_4 = row.createCell((short)4);
	        cell_4.setCellValue("Age");
	        cell_4.setCellStyle(titleStyle);
	         
	        HSSFCell cell_5 = row.createCell((short)5);
	        cell_5.setCellValue("JoinDate");
	        cell_5.setCellStyle(titleStyle);
	         
	        // ## Content Style Setting
	        HSSFCellStyle contentStyle = workBook.createCellStyle();
	        contentStyle.setFont(font);
	         
	        //  Content align : center
	        HSSFCellStyle styleCenter = workBook.createCellStyle();
	        styleCenter.setAlignment(HSSFCellStyle.ALIGN_CENTER);
	        styleCenter.setFont(font);
	         
	        //  ObjectList �� ��������� ���� ��� �� ����
	        if(userList == null) return workBook;
	         
	        //  ObjectList ������ ���
	        for(int i = 0; i < userList.size(); i++){
	            // 1��° ���� �����̴� �ǳ� ��
	            row = sheet.createRow((short)(i+1));
	            User user = userList.get(i);
	             
	            cell_0 = row.createCell((short)0);
	            cell_0.setCellValue(user.getNo());
	            cell_0.setCellStyle(styleCenter);
	             
	            cell_1 = row.createCell((short)1);
	            cell_1.setCellValue(user.getEmail());
	            cell_1.setCellStyle(styleCenter);
	             
	            cell_2 = row.createCell((short)2);
	            cell_2.setCellValue(user.getPassword());
	            cell_2.setCellStyle(styleCenter);
	             
	            cell_3 = row.createCell((short)3);
	            cell_3.setCellValue(user.getName());
	            cell_3.setCellStyle(styleCenter);
	             
	            cell_4 = row.createCell((short)4);
	            cell_4.setCellValue(user.getAge());
	            cell_4.setCellStyle(styleCenter);
	             
	            cell_5 = row.createCell((short)5);
	            cell_5.setCellValue(user.getDate());
	            cell_5.setCellStyle(styleCenter);
	        }
	         
	        return workBook;
	    }
	     
	    private FileOutputStream setFile(String filePath, String excelFileName)throws FileNotFoundException{
	        File dir = new File(filePath);
	         
	        if(!dir.exists()) dir.mkdirs();
	         
	        FileOutputStream fout = new FileOutputStream(filePath+excelFileName);
	         
	        return fout;
	    }
	}
	


}
	

