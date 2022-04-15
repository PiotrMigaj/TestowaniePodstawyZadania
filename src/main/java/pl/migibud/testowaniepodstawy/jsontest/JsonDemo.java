package pl.migibud.testowaniepodstawy.jsontest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonDemo {

    public static void main(String[] args) throws IOException {

        PdfWriter pdfWriter = new PdfWriter("target/emp.pdf");
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);
        pdfDocument.setDefaultPageSize(PageSize.A4);


        float col = 280f;
        float[] columnWidth = {col,col};

        Table table = new Table(columnWidth);
        table.addCell(new Cell().add("czesc"));

        document.add(table);
        document.close();






//        ObjectMapper om=new ObjectMapper();
//
//        File jsonfile=new File("target/emp.json");
//        Employee cd=om.readValue(jsonfile, Employee.class);
//
//        System.out.println(cd.toString());


    }


//        JSONParser jsonParser = new JSONParser();
//
//        Employee employee;
//
//
//        try {
//
//
////            FileReader reader = new FileReader("target/emp.json");
////            Object obj = jsonParser.parse(reader);
////
////            JSONObject empjsonobj=(JSONObject) obj;
////            String name = (String) empjsonobj.get("name");
////            System.out.println(name);
//
//            ObjectMapper objectMapper = new ObjectMapper();
//            File jsonFile = new File("target/emp.json");
//
//
//            employee = objectMapper.readValues(jsonFile.toString(),Employee.class);
//
////
////            Employee employee = new Employee("Piotr","Wroclaw");
////
////            objectMapper.writeValue(new File("target/emp.json"),employee);
//        }catch (final Exception e){
//            e.printStackTrace();
//        }
//
//    }

}
