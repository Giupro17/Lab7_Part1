/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;
    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }
    
    public String busiestHour(){  //15
        int busiestHour = -1;
        int maxCount = 0;
        for (int i = 0; i < hourCounts.length; i++){
            if (hourCounts[i] > maxCount){
                maxCount = hourCounts[i];
                busiestHour = i;
        }
       }
        return "" + busiestHour +" is the busiest hour";
    }
    
    public String quitestHour(){ //16 
        int quietestHour = 0;
        int lowCount = hourCounts[0];
        for (int i = 1; i < hourCounts.length; i++){
            if (hourCounts[i] < lowCount){
                lowCount = hourCounts[i];
                quietestHour = i;
            }
       }
        return quietestHour +" is the busiest hour";
    }
    
    public int numberOfAccesses() { //14
        int total = 0;  
        for (int count : hourCounts) {
           total += count;
        }
        return total;
    } 
    
    public void test() {  //11
         int [] marks = {1,3,4,5};
         for(int index = 0; index < marks.length; index++) {
                  if(marks[index] > 0) {
                       System.out.println(marks[index]);
                }
           }
    }  
   
    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        //10
            int hour = 0;
        while (hour  < hourCounts. length){
          System.out.println(hour + ": " + hourCounts[hour]);
                hour++;
            }
        }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
/*
 * 1. Busiest time of the day is hour 18, hour 18 will print.
 * 2. private int [] person = {};
 * 3. private boolean {} vacant = {};
 * 5. 1 - the [] is before the int instead of being after it
 *    2 - boolean [] occupied = new boolean[5000];
 * 6. double[] readings = new double[] 60;
 * String [] urls = new String = [90];
 * TicketMachine[] machines = new TicketMachine = [5];
 * 7. 20 Strings
 * 8. It should be new double[50];
 * 9. Its out of bonds of 24 
 * 11. public void printGreater(double[] marks, double mean) {
           for(index = 0; index < marks.length; index++) {
                  if(marks[index] > mean) {
                       System.out.println(marks[index]);
        }
     }
   }
 * 13. for (int count : hourCounts) {
        total += count;
 *   
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */