class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int l=0,b=0, area1, area2;
        
        if(bx1>=ax1 && bx1<=ax2)
        {
            if(bx2<=ax1)
                l = Math.abs(bx1-ax1);
            else if(bx2>=ax2 && bx2>=ax1)
                l = Math.abs(bx1-ax2);
            else
                l = Math.abs(bx1-bx2);
        }
        
        else if(bx2>=ax1 && bx2<=ax2)
        {
            if(bx1<=ax1)
                l = Math.abs(bx2-ax1);
            else if(bx1>=ax2)
                l = Math.abs(bx2-ax2);
            else 
                l = Math.abs(bx1-bx2);
        }
        else if(bx1<=ax1 && bx2>=ax2)
            l = Math.abs(ax2-ax1);
        
        if(by1>=ay1 && by1<=ay2)
        {
            if(by2<=ay1)
                b = Math.abs(by1-ay1);
            else if(by2>=ay2)
                b = Math.abs(by1-ay2);
            else 
                b = Math.abs(by1-by2);
        }
        else if(by2>=ay1 && by2<=ay2)
        {
            if(by1<=ay1)
                b = Math.abs(by2-ay1);
            else if(by1>=ay2)
                b = Math.abs(by2-ay2);
            else 
                b = Math.abs(by1-by2);            
        }
        else if(by1<=ay1 && by2>=ay2)
            b = Math.abs(ay1-ay2);
        
        area1 = Math.abs((ax2-ax1)*(ay2-ay1));
        area2 = Math.abs((bx2-bx1)*(by2-by1));
        
       // System.out.println(area1);
        //System.out.println(area2);
        //System.out.println(l*b);
        return area1+area2-l*b;
    }
}