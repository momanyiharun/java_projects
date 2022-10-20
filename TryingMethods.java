//This is me trying to practise methods in Java
public class TryingMethods {
 
   public static void main(String[] args) {
    
    }   

   String getDay(int day) {
    String dayOfTheWeek;
    switch (day) {
        case  1:
        dayOfTheWeek = "Sunday";
        break;
        case 2: 
        dayOfTheWeek = "Monday";
        break;
        case 3:
        dayOfTheWeek = "Tuesday";
        break;
        case 4:
        dayOfTheWeek = "Wednesday";
        break;
        case 5:
        dayOfTheWeek = "Thursday";
        break;
        case 6:
        dayOfTheWeek = "Friday";
        break;
        case 7:
        dayOfTheWeek = "Saturday";
        break;
        default:
            break;

    }
    return dayOfTheWeek;  
    

}