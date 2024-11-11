package MiniReports;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
류지헌
깜짝과제 1번 : 자바의 환경정보 출력하는 화면인 property.html 작성
 */

public class SurpriseReport_1 {
    public static void main(String[] args) {
        try{
            File file = new File("property.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("" +
                    "<html>" +
                    "<head> \r\n " +
                    "<meta charset=\"UTF-8\"/>\r\n" +
                    "<style>\r\n" +
                    "table { border-collapse: collapse; width: 100%; }\r\n" +
                    "th, td { border:solid 1px #000;}\r\n" +
                    "</style>\r\n" +
                    "</head>\r\n" +
                    "<body>\r\n" +
                    "<h1>자바 환경정보</h1>\r\n" +
                    "<table>\r\n" +
                    "<tr>\r\n" +
                    "<th>키</th>\r\n" +
                    "<th></th>\r\n" +
                    "</tr>\r\n");

            for(Object k : System.getProperties().keySet())
            {
                String key = k.toString();
                String value = System.getProperty(key);
                writer.write("" +
                        "<tr>\r\n" +
                        "<td>" + key + "</td>\r\n" +
                        "<td>" + value + "</td>\r\n" +
                        "</tr>\r\n");
            }

            writer.write("" +
                    "</table>\r\n" +
                    "</body>\r\n" +
                    "</html>");
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
