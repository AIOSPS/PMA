package eu.pms.common.tools;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.Region;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Ibrahim Assi (iassi)
 * Date: 06/01/2014
 * Time: 12:31:04 م
 */
public class ExcelTool
{
    public ExcelTool() {
    }

    public List buildExcelFile(String [] colName,String [][] rowVal,String sheetName)
    {
        List retList=new ArrayList();

        HSSFWorkbook wb    = new HSSFWorkbook();
        HSSFFont font = wb.createFont();

        //make it whight
        font.setColor( (short)000 );
        //set font 2 to 10 point type
        font.setFontHeightInPoints((short) 14);
        //make it bold
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);


        HSSFCellStyle style = wb.createCellStyle();
        style.setFont(font);
        style.setFillBackgroundColor((short)0xc);


         HSSFSheet sheet = wb.createSheet();

        wb.setSheetName(0,sheetName);

        HSSFRow row=null;
        HSSFRow headerRow=null;
        HSSFCell cell=null;

        /*create Header */
        headerRow  = sheet.createRow((short)0);

        for(int i=0;i<colName.length;i++)
        {
            cell  = headerRow.createCell((short)i);
            cell.setCellValue(new HSSFRichTextString(colName[i]));
            cell.setCellStyle(style);
            
        }


        // create rows
        for(int r=0;r<rowVal.length; r++)
        {
             row  = sheet.createRow((short)(r+1));
             for (int c=0; c<rowVal [r].length; c++)
             {
                 cell  = row.createCell((short)c);
//                 cell.setEncoding(HSSFCell.ENCODING_UTF_16);
                 cell.setCellValue(new HSSFRichTextString(rowVal [r][c]));
             }
        }

        retList.add(wb);

        return  retList;


    }

    public List buildExcelFile(String title,String [] colName,String [][] rowVal,String [] footerVal,String sheetName)
       {
           List retList=new ArrayList();

           HSSFWorkbook wb    = new HSSFWorkbook();
           HSSFFont font = wb.createFont();

           //make it whight
           font.setColor( (short)000 );
           //set font 2 to 10 point type
           font.setFontHeightInPoints((short) 14);
           //make it bold
           font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);


           HSSFCellStyle style = wb.createCellStyle();
           style.setFont(font);
           style.setFillBackgroundColor((short)0xc);

           HSSFCellStyle styleTitle = wb.createCellStyle();
           styleTitle.setFont(font);
           styleTitle.setFillBackgroundColor(HSSFColor.YELLOW.index);
           styleTitle.setFillPattern(HSSFColor.YELLOW.index);
           styleTitle.setAlignment(HSSFCellStyle.ALIGN_LEFT);



            HSSFSheet sheet = wb.createSheet();

           wb.setSheetName(0,sheetName);

           HSSFRow  row=null;
           HSSFRow  titleRow=null;
           HSSFRow  headerRow=null;
           HSSFRow  footerRow=null;
           HSSFCell cell=null;

           int rowIndex=0;
           /*create Titel  -----------------*/
           titleRow  = sheet.createRow((short)rowIndex++);

           cell  = titleRow.createCell((short)0);
           cell.setCellValue(new HSSFRichTextString(title));
           cell.setCellStyle(styleTitle);
           sheet.addMergedRegion(new Region((short)0,(short)0,(short)0,(short)20));

           /*create Header  -----------------*/
           headerRow  = sheet.createRow((short)rowIndex++);

           for(int i=0;i<colName.length;i++)
           {
               cell  = headerRow.createCell((short)i);
               cell.setCellValue(new HSSFRichTextString(colName[i]));
               cell.setCellStyle(style);
           }
           /* create rows ------------------*/
           for(int i=0;i<rowVal.length; i++)
           {
                row  = sheet.createRow((short)(rowIndex++));
                for (int c=0; c<rowVal [i].length; c++)
                {
                    cell  = row.createCell((short)c);
//                    cell.setEncoding(HSSFCell.ENCODING_UTF_16);
                    cell.setCellValue(new HSSFRichTextString(rowVal [i][c]));
                }
           }
            /*create Footer ------------------- */
           if (footerVal != null) {
               footerRow = sheet.createRow((short) (rowIndex++));
               for (int i = 0; i < colName.length; i++) {
                   cell = footerRow.createCell((short) i);
                   cell.setCellValue(new HSSFRichTextString(footerVal[i]));
                   cell.setCellStyle(style);
               }
           }

           retList.add(wb);

           return  retList;


       }
   }
