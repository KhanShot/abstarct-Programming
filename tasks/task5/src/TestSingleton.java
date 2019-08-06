import com.oracle.tools.packager.Log;

public class TestSingleton {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();

        MyThread2 thread2 = new MyThread2();

        thread2.start();
        MyThread3 thread3 = new MyThread3();
        thread3.start();

    }
}

//    LoggerSingleton logger1 = new LoggerSingleton();
//    LoggerSingleton logger2 = new LoggerSingleton();
//    LoggerSingleton logger3 = new LoggerSingleton();
//		logger1.logError("11111", "HIGH");
//                logger1.logConnection("100.10.0.82", "18:12");
//                logger1.logChange("Folder bin", "00:42");
//                logger2.logError("11251", "LOW");
//                logger2.logConnection("122.10.0.7", "11:36");
//                logger3.logConnection("28.100.0.19", "06:37");
//                logger3.logChange("File exam.txt", "07:44");

class MyThread1 extends Thread {
    public void run() {
        LoggerSingleton logger1 = LoggerSingleton.getLoggerSingleton();
        logger1.logError("11111", "HIGH");
        logger1.logConnection("100.10.0.82", "18:12");
        logger1.logChange("Folder bin", "00:42");

    }
}
class MyThread2 extends Thread {
    public void run() {
        LoggerSingleton logger2 = LoggerSingleton.getLoggerSingleton();

        logger2.logError("11251", "LOW");
        logger2.logConnection("122.10.0.7", "11:36");
        logger2.logChange("file mile kile", "24:61");

    }
}
class MyThread3 extends Thread {
    public void run() {
        LoggerSingleton logger3 = LoggerSingleton.getLoggerSingleton();


         logger3.logConnection("28.100.0.19", "06:37");
         logger3.logChange("File exam.txt", "07:44");

    }
}