
import pkg321.Task_01;
import java.util.Date;
import java.util.concurrent.TimeUnit;
 
public class Task_01_Tester {
    public static void main(String[] args ) throws InterruptedException {
        long startTime = new Date().getTime();
        
        
        Task_01 myThread1 = new Task_01();
        Task_01 myThread2 = new Task_01();

        myThread1.Step_One();
      
          long endTime = new Date().getTime();
 
        long timeElapsed = endTime - startTime;
 
        System.out.println("Execution time in milliseconds: " + timeElapsed);

        myThread2.Step_Two();
          long endTime2 = new Date().getTime();
 
        long timeElapsed2 = endTime2 - startTime;
 
        System.out.println("Execution time in milliseconds: " + timeElapsed2);

        myThread1.Step_Three();
        //System.out.println(myThread1.getName());
   
            long endTime3 = new Date().getTime();
 
        long timeElapsed3 = endTime3 - startTime;
 
        System.out.println("Execution time in milliseconds: " + timeElapsed3);
    
    
    }
    
}
