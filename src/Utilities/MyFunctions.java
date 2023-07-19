package Utilities;
public class MyFunctions {
    public static void waitFunc(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void waitAndQuitFunc(int second){
//        try {
//            Thread.sleep(second*1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//
//        }
//        driver.quit();
//    }
}