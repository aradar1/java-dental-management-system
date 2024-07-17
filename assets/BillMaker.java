
import java.sql.ResultSet;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import javax.swing.text.Document;
//import com.itextpdf.layout.Document; 
import java.io.FileOutputStream;
//import com.itextpdf.text.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zeezy
 */
public class BillMaker {

    
       public String CompanySignature(){
           String longSpace = "              ";
           String tabs = "%-30s%s%n";
        String pdfcomponent = longSpace + "        " + "De Ramos Dental Clinic\n";
        //pdfcomponent += longSpace + "DOH Accredited Drug Testing Center and DOH Secondary Laboratory Services\n";
        pdfcomponent +="B6 L7 St. Paul Street St. Francis 7 Subd., San Antonio Biñan Laguna\n";
        pdfcomponent += "Tel. No: (049) 533 - 8333 \n";
        pdfcomponent += "E-mail Address: carolinederamos@yahoo.com\n\n";
        pdfcomponent += "------------------------------------------------------------------------------------------------------------";
        return pdfcomponent;
    }
       
     
}
