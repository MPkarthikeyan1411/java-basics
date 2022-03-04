import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testdate2 {
public static void main(String[] args) throws ParseException {
    String sdate="14/11/2001";
    Object date= new SimpleDateFormat("DD/MM/YYYY").parseObject(sdate);
    System.out.println(sdate+"t"+date);
}
}
