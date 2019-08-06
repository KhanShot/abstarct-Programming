public class TestSingleton {
    public static void main(String args[]){

        class MyThread1 extends Thread {
            public void run() {

                LoggerSingleton logger1 = new LoggerSingleton();
                logger1.logError("11111", "HIGH");
                logger1.logConnection("100.10.0.82", "18:12");
                logger1.logChange("Folder bin", "00:42");

            }
        }
        class MyThread2 extends Thread {
            public void run() {
                //LoggerSingleton logger2 = LoggerSingleton.getLoggerSingleton();
                LoggerSingleton logger2 = new LoggerSingleton();
                logger2.logError("11251", "LOW");
                logger2.logConnection("122.10.0.7", "11:36");
                logger2.logChange("file mile kile", "24:61");

            }
        }
        class MyThread3 extends Thread {
            public void run() {
                //LoggerSingleton logger3 = LoggerSingleton.getLoggerSingleton();
                LoggerSingleton logger3 = new LoggerSingleton();

                logger3.logConnection("28.100.0.19", "06:37");
                logger3.logChange("File exam.txt", "07:44");

            }
        }
    }
}