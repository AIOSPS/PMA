package eu.pms.testing;

import eu.pms.common.component.DataAccessObjectImpl;

import java.util.Collection;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import junit.framework.TestCase;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.hibernate.LazyInitializationException;


/**
 * Created by IntelliJ IDEA.
 * User:  Ibrahim Assi (iassi)
 * Date: May 30, 2012
 * Time: 8:28:22 AM
 */
public class HqlQuery extends TestCase {


    private  JTable table;
    private  JTextArea  inputQuery;
    private  JFrame frame ;
    private  JLabel resultCountCmp;
    private  JLabel reternTypeCmp;
    private  JPopupMenu Pmenu;
    private  JMenuItem menuItem;

    private  String row[][] =null;
    private  String col [] =null;
    private  String returnType =null;
    private  String resultCount =null;
    private  DataAccessObjectImpl cmp=null;


public HqlQuery()  throws Exception
{

        view();

}

private void fillData( Collection res) throws IllegalAccessException, InvocationTargetException
{

   Object obj=res.iterator().next();
   int noOfCol=0;
   Method[] method=obj.getClass().getDeclaredMethods();
   for(Method m:method)
   {  if(m.getName().startsWith("get"))
       {
           noOfCol++;
       }
   }
   col=new String[noOfCol];


   returnType=" "+obj.getClass().getName();
   Iterator itr=res.iterator();
   row= new String[res.size()][noOfCol];
   int j=0;
   Object value=null;
   while(itr.hasNext())
   {
    obj=itr.next();
       
    if(obj ==null)break;

    method=obj.getClass().getDeclaredMethods();

    int colNo=0;
    for( int i=0;method.length>i;i++)
    {
       if(method[i].getName().startsWith("get"))
      {
          if(col[colNo]==null)
          col[colNo]= method[i].getName().substring(3) ;

           value=method[i].invoke(obj,null);

        if(value==null)
            row[j][colNo] =value+"";
        else if(value.getClass().getName().startsWith("java.") )
            row[j][colNo] =value+"";
        else
        {
             row[j][colNo] =getDataOfObject(method[i].invoke(obj,null));;
        }





           colNo++;
      }
    }
       j++;
   }



}
private void fillData(Object[] data,String objType)
{
          col=new String[]{objType};

          row= new String[data.length][1];
          for(int i=0;i<data.length;i++)
             row[i][0]=data[i]+"";

            resultCount=data.length+"";
            returnType=objType;
}
private void fillData(Object[] rowData )
{


   col=new String[rowData.length];
   row= new String[1][rowData.length];
    for(int i=0;i<rowData.length;i++)
   {
       col[i]=rowData[i].getClass().getName();
       row[0][i]=rowData[i]+"";

   }
      resultCount="1";
      returnType="Array Of Object";

}

public static void main(String[] args) throws Exception
{

       new HqlQuery();

   }

public void view(  ) throws Exception
{


     frame = new JFrame("HQL GUERY");
     JPanel mainFormPanel=new  JPanel();
     mainFormPanel.setPreferredSize(new Dimension(1000, 500));
     BoxLayout layoutMain =new BoxLayout(mainFormPanel,BoxLayout.Y_AXIS);
     mainFormPanel.setLayout(layoutMain);

    BorderLayout layout =new BorderLayout();
    layout.setHgap(1);
    JPanel panelrequest = new JPanel(layout);
    inputQuery=new  JTextArea  () ;
    inputQuery.setBorder(new CompoundBorder( new LineBorder(Color.GRAY), new EmptyBorder(1, 3, 1, 1)));
    Pmenu = new JPopupMenu();
    menuItem = new JMenuItem(new DefaultEditorKit.CopyAction());
    Pmenu.add(menuItem);
    menuItem = new JMenuItem(new DefaultEditorKit.PasteAction());
    Pmenu.add(menuItem);
    menuItem = new JMenuItem(new DefaultEditorKit.CutAction());
    Pmenu.add(menuItem);
    Pmenu.add(menuItem);
    inputQuery.addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent Me){
              if(Me.isPopupTrigger()){
              Pmenu.show(Me.getComponent(), Me.getX(), Me.getY());
                                                                      } } });
    JScrollPane panejText = new JScrollPane(inputQuery);
    panejText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    panejText.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    panejText.setPreferredSize(new Dimension(frame.getWidth(),150));

    panelrequest.add(panejText,BorderLayout.CENTER);

    FlowLayout layoutbtnPanel=new FlowLayout();
    layoutbtnPanel.setAlignment(FlowLayout.LEFT);
    JPanel btnPanel = new JPanel(layoutbtnPanel);
    JButton btn=new JButton ("execute");
     btn.addActionListener(new java.awt.event.ActionListener()
    { public void actionPerformed(ActionEvent ev)  {
        try {
            executeQuery() ;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame,"Have a Error");
            clearData();
            e.printStackTrace();
        }
    } });
    btnPanel.add(btn);
    btnPanel.add(new JLabel("    "));
    resultCountCmp=new JLabel("");
    reternTypeCmp=new JLabel("");
    btnPanel.add(resultCountCmp);
    btnPanel.add(new JLabel("    "));
    btnPanel.add(reternTypeCmp);
    panelrequest.add(btnPanel,BorderLayout.SOUTH);
    mainFormPanel.add(panelrequest);

    DefaultTableModel modeltable = new DefaultTableModel(row,col);

    table = new JTable(modeltable);
    Dimension dimen = new Dimension(0,0);
    table.setIntercellSpacing(new Dimension(dimen));
    table.setRowHeight(table.getRowHeight()+10);
    table.setRowSelectionAllowed(true);
    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

    JTableHeader head = table.getTableHeader();
    head.setBackground(Color.pink);
    JScrollPane pane = new JScrollPane(table);
    pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    mainFormPanel.add(pane);

    frame.add(mainFormPanel);
    frame.setSize(1000,500);
    Toolkit tk = Toolkit.getDefaultToolkit();
    frame.setLocation((tk.getScreenSize().width / 2)-(frame.getWidth()/2), (tk.getScreenSize().height / 2)-(frame.getHeight()/2));
    frame.setUndecorated(true);
    frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // frame.setExtendedState(JFrame.ICONIFIED);
    frame.setVisible(true);
}

private void executeQuery() throws Exception
{
    if(inputQuery.getText()==null||inputQuery.getText().equals(""))
    {
         JOptionPane.showMessageDialog(frame,"Please Enter Hql Query");
         return;
    }


     cmp= new DataAccessObjectImpl();
     Collection res=cmp.getFromDynamicQuery(inputQuery.getText());

    resultCount=" "+(res!=null?res.size()+"":"0 (null)");
    returnType="null";
    if(res==null||res.size()==0)
    {
        JOptionPane.showMessageDialog(frame," No Data Found");
        clearData();
        return;
    }
//    System.out.println("Output Data ");
    String objType=res.iterator().next().getClass().getName();

      if(res.iterator().next() instanceof Object[])
      {
           fillData((Object[])res.iterator().next());
           refresh() ;
      }

      else if(objType.startsWith("java.") )
      {
            fillData(res.toArray(),objType);
            refresh() ;
      }

      else
      {
          fillData(res);
          refresh() ;
      }
}

private void refresh()
{
    table.setModel(new DefaultTableModel(row,col));
    resultCountCmp.setText(" result count : "+resultCount);
    reternTypeCmp.setText(" retern Type : "+returnType);

}

private void clearData()
{
    table.setModel(new DefaultTableModel(new String[0][0],new String[0]));
    resultCountCmp.setText("");
    reternTypeCmp.setText(" ");

}
  private String getDataOfObject(Object obj) throws IllegalAccessException, InvocationTargetException {
      String retString="";

     if(obj!=null&&obj.getClass().getName().startsWith("edu."))
     {
       try
       {
            Method[] method=obj.getClass().getDeclaredMethods();
            for( int i=0;method.length>i;i++)
            {
            if(method[i].getName().startsWith("get"))
            retString+=method[i].getName().substring(3)+"["+method[i].invoke(obj,null)+"] ";

            }
       }
       catch(LazyInitializationException e)  {retString=obj.getClass().getName()+"";      }

     }
      else
     {
         // if not qou class


        retString=obj.getClass().getName()+"";

     }

      return retString;
  }




}
