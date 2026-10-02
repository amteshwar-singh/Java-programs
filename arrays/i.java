public class i {
public static int variable(int s){
     s=5;
    return s;

}
public static void array(int n[]){
    n[0]=88;
}
public static void main(String args[]) {
int s=0;
int b[]={5,4};
variable(s);
array(b);
System.out.println(variable(s));
System.out.println(b[0]);
}
} 