
public class $04shortestroute {

    public static double shortest(String path) {
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=(x*x);
        int y2=(y*y);
        return (double)Math.sqrt(x2+y2);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        double s = shortest(path);
        System.out.println(s);
    }
}
