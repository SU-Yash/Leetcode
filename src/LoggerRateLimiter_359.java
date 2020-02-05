import java.util.HashMap;
import java.util.logging.Logger;

public class LoggerRateLimiter_359 {
    private HashMap<String, Integer> msgDict;

    /** Initialize your data structure here. */
    public LoggerRateLimiter_359() {
        msgDict = new HashMap<String, Integer>();
    }

    /**
     * Returns true if the message should be printed in the given timestamp, otherwise returns false.
     */
    public boolean shouldPrintMessage(int timestamp, String message) {

        if (!this.msgDict.containsKey(message)) {
            this.msgDict.put(message, timestamp);
            return true;
        }

        Integer oldTimestamp = this.msgDict.get(message);
        if (timestamp - oldTimestamp >= 10) {
            this.msgDict.put(message, timestamp);
            return true;
        } else
            return false;
    }

    public static void main(String[] args){
        LoggerRateLimiter_359 lr = new LoggerRateLimiter_359();
        System.out.println(lr.shouldPrintMessage(3, "Hello"));
        System.out.println(lr.shouldPrintMessage(13, "Hello"));
        System.out.println(lr.shouldPrintMessage(15, "Hello"));
    }
}
