class Logger {

    HashMap<String, Integer> hm = new HashMap<>();
    public Logger() {
        
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        if(hm.containsKey(message)) {
            int time = hm.get(message);
            
            if(timestamp < time+10)
                return false;
            else
                hm.put(message, timestamp);
        }
        else
            hm.put(message, timestamp);
        
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */