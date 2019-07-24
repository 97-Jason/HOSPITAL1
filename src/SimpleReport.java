
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SimpleReport {
     DefaultTableModel tableModel;
   //tableModel=new configreports().jtblstudentsdata.getModel();
  
    public SimpleReport(DefaultTableModel tableModel) {
        JasperPrint jasperPrint = null;
       // TableModelData();// how is this called....
        try {
            JasperCompileManager.compileReportToFile("C:\\Users\\USER\\Documents\\JASON JAVA POJECTS\\Hospital1\\src\\reports\\customerpayments.jrxml");
            jasperPrint = JasperFillManager.fillReport("C:\\Users\\USER\\Documents\\JASON JAVA POJECTS\\Hospital1\\src\\reports\\customerpayments.jasper", new HashMap(),
                    new JRTableModelDataSource(tableModel));
            JasperViewer jasperViewer = new JasperViewer(jasperPrint,false);
            jasperViewer.setVisible(true);
            
        
        } catch (JRException ex) {
            ex.printStackTrace();
        }
        
    }
       
}
