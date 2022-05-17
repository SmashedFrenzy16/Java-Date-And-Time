import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  
  public static void main(String[] args) {
    
    LocalDateTime dateTimeObj = LocalDateTime.now();
    
    DateTimeFormatter formattedObj = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss:ns");
    
    String finalFormat = dateTimeObj.format(formattedObj);
    
    System.out.println("Date and time currently: " + finalFormat)
    
    
  
  
  
  
  }






}
