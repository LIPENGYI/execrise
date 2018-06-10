public class MyApplication{ 
    public String name="abc"; 
    public static void main(String[] args){ 
        MyApplication test=new MyApplication(); 
        MyApplication testB=new MyApplication(); 
        System.out.println(test.equals(testB)+","+test.name.equals(testB.name)); 
        short a = 128; byte b = (byte) a;
        System.out.println(a+""+b);
        Float f = new Float(1.0);
        
    } 
}