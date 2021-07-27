class Solution {
    public double angleClock(int hour, int minutes) {
        
        double h = 12;
        double minAngle = minutes*6;
        
        double hourAngle ;
        
        if(hour == 12)
            hour=0;
        
        if(hour==0 && minutes==0)
            hourAngle = 0;
        else
            hourAngle = ((hour*60)+(double)minutes)/2;
        
        minAngle = Math.abs(minAngle);
        hourAngle = Math.abs(hourAngle);
        
        double res = Math.abs(minAngle-hourAngle);
        
        double res360 = Math.abs(360-res);
        
        return Math.min(res, res360);
    }
}