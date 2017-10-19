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
	     * 호출 메소드
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
	     * 핵심 프로세스
	     */
	    public HSSFWorkbook createExcel(List<user> userList){
	        // Excel Write
	        workBook = new HSSFWorkbook();
	        HSSFSheet sheet = workBook.createSheet("UserList");
	         
	        // ## Font Setting
	        // @HSSFFont : 폰트 설정
	        //  - FONT_ARIAL : 기본
	        HSSFFont font = workBook.createFont();
	        font.setFontName(HSSFFont.FONT_ARIAL);
	         
	        // ## Title Style Setting
	        // @HSSFColor : 셀 배경색
	        //  - GREY_$_PERCENT : 회색 $ 퍼센트
	        // @HSSFCellStyle
	        //  - ALIGN_$ : $ 쪽 정렬
	        HSSFCellStyle titleStyle = workBook.createCellStyle();
	        titleStyle.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
	        titleStyle.setFillPattern(HSSFCellStyle.ALIGN_LEFT);
	        titleStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
	        titleStyle.setFont(font);
	         
	        // ## Row Create
	        // ? 가로열 생성
	        HSSFRow row = sheet.createRow((short)0);
	         
	        // ## Title Cell Create
	        // @row.createCell((short)n) : n번째 셀 설정
	        // @setCellValue(String) : n 번째 셀의 내용
	        // @setCellStyle(style) : n 번째 셀의 스타일
	        HSSFCell cell_0 = row.createCell((short)0);
	        cell_0.setCellValue("번호");
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
	         
	        //  ObjectList 가 비어있으면 제목만 출력 후 종료
	        if(userList == null) return workBook;
	         
	        //  ObjectList 엑셀에 출력
	        for(int i = 0; i < userList.size(); i++){
	            // 1번째 행은 제목이니 건너 뜀
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
	

