public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int second=0, minutes=0, hour=0,  maxSecMin = 59,  maxHours = 99 ;

        while(seconds >=3600 && maxHours > hour){
        hour++;
        seconds-=3600;
    }

    while(seconds >= 60 && maxSecMin > minutes){
        minutes++;
        seconds-=60;
    }

    while(seconds > 0 && maxSecMin > second){
        second++;
        seconds--;
    }

    String formattedTime = String.format("%02d:%02d:%02d", hour, minutes, second);
    return formattedTime;    
  }
}