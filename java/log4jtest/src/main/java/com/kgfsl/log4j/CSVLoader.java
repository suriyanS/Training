package com.kgfsl.log4j;
import java.io.FileReader;
import java.util.*;
import java.io.*;
import java.sql.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
public class CSVLoader
{
public static void main(String args[])throws IOException
{

parseCSVToBeanList();
//writeCSVData();
upload();

}
private static void parseCSVToBeanList()  {
		
		HeaderColumnNameTranslateMappingStrategy<Student> beanStrategy = new HeaderColumnNameTranslateMappingStrategy<Student>();
		beanStrategy.setType(Student.class);
		
		Map<String, String> columnMapping = new HashMap<String, String>();
		columnMapping.put("ID", "id");
		columnMapping.put("Name", "name");
		columnMapping.put("Dept", "dept");
		columnMapping.put("Age", "age");
		
		beanStrategy.setColumnMapping(columnMapping);
		
		CsvToBean<Student> csvToBean = new CsvToBean<Student>();
        try{
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\suriyan.s\\Documents\\suriyan\\student.csv"));
		List<Student> emps = csvToBean.parse(beanStrategy, reader);
		System.out.println(emps);
    
}
        catch(FileNotFoundException ex)
        {
System.out.println(ex);
        }
}
private static void writeCSVData(List<Student> emps) throws IOException {
		StringWriter writer = new StringWriter();
		CSVWriter csvWriter = new CSVWriter(writer,'#');
		List<String[]> data  = toStringArray(emps);
		csvWriter.writeAll(data);
		csvWriter.close();
		System.out.println(writer);
	}
    private static List<String[]> toStringArray(List<Student> emps) {
		List<String[]> records = new ArrayList<String[]>();
		//add header record
		records.add(new String[]{"ID","Name","Role","Salary"});
		Iterator<Student> it = emps.iterator();
		while(it.hasNext()){
			Student emp = it.next();
			records.add(new String[]{emp.getId(),emp.getName(),emp.getDept(),emp.getAge()});
		}
		return records;
	}
static void upload()
{
Connection connection = DBConnection.getDBConnection();
try
{

String loadQuery = "LOAD DATA LOCAL INFILE '" + "C://Users//suriyan.s//Documents//suriyan//student.csv" + "' INTO TABLE student FIELDS TERMINATED BY ','" + " LINES TERMINATED BY '\n'" ;
System.out.println(loadQuery);

Statement stmt = connection.createStatement();

stmt.execute(loadQuery);
System.out.println("Upload successfully");

}

catch (Exception e)
{
e.printStackTrace();
}




}
}
