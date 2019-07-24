import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class javaDB_001 {
    String host="jdbc:mysql://localhost:3306/patient";
    String user="root";
    String pass="";
    
    Connection conn;
    private String idnumber;
    
    public Connection getConnection(){
        try{
            conn=DriverManager.getConnection(host, user, pass);
            JOptionPane.showMessageDialog(null, "Connection successful");
            return conn;
        }
 catch(SQLException ex){
           JOptionPane.showMessageDialog(null,ex.getMessage());
           return null;
            }
    }
    public void insertpatientsrecord(String patientname, String idnumber, String gender, String medicalrecordno, 
            String dateofbirth, String age, String diagnosis, String comments, String status, String doctorsname){ 
          
        String q="INSERT into patientsrecord( patientname, idnumber, gender, dateofbirth, medicalrecordno,"
                + " age, diagnosis, comments, status, doctorsname) VALUES(?,?,?,?,?,?,?,?,?,?)";
        int k=0;
        try{          
        
       PreparedStatement st=getConnection().prepareStatement(q);
        st.setString(1,patientname);
        st.setString(2,idnumber);
        st.setString(3,gender);
        st.setString(4,dateofbirth);
        st.setString(5,medicalrecordno);
        st.setString(6,age);
        st.setString(7,diagnosis);
        st.setString(8,comments);
        st.setString(9,status);
        st.setString(10,doctorsname);
        
        if(st.executeUpdate()>k){
            JOptionPane.showMessageDialog(null, idnumber+" You sucessfully registered");
        }
        }
    
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        }
     public ResultSet getpatient(){
         String q="SELECT * FROM patientsrecord";
         try{
             Statement st=getConnection().createStatement();
             ResultSet rs=st.executeQuery(q);
             return rs;
         }
         catch(SQLException ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
              return null;
         }
         }
      public void updateregistration(String id, String idnumber,String patientname ,String gender ,String dateofbirth,
            String age){
         String q="UPDATE  patientsrecord SET id=?, patientname=?,gender=?,dateofbirth=?,"
                 + "age=? WHERE idnumber=?";
                        int k=0; 

            
         try{
          PreparedStatement pst=getConnection().prepareStatement(q);
         pst.setString(1,id);
         pst.setString(2,patientname);
         pst.setString(3,gender);
         pst.setString(4,dateofbirth);
         pst.setString(5,age);
         pst.setString(6,idnumber);
          
          
         
         
 if(pst.executeUpdate()>k)
           {
           JOptionPane.showMessageDialog(null, idnumber+ "record successfully updated");
           }
}
catch(SQLException x)
           {
     JOptionPane.showMessageDialog(null,x.getMessage());
 }
 }

     public void deleteregistration(String idnumber) {
         String q="DELETE FROM  patientsrecord WHERE idnumber=?";

         try{
            int k=0;

             PreparedStatement st=getConnection().prepareStatement(q);
                st.setString(1,idnumber);
       if(st.executeUpdate()>k){
               JOptionPane.showMessageDialog(null,idnumber+" record deleted");
    }
}
catch(SQLException ex){
    
JOptionPane.showMessageDialog(null,ex.getMessage());
}
} 

   
}
     



