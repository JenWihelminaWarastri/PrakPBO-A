// Source code is decompiled from a .class file using FernFlower decompiler.
public class MOuter {
    private int m = (int)(Math.random() * 100.0);
 
    public MOuter() {
    }
 
    public void go(int var1, int var2) {
       int var3 = var1 + var2;
       int var4 = var1 - var2;
       MOuter$1MInner var5 = new MOuter$1MInner(this, var1, var2, var3, var4);
       var5.method();
    }
 
    public static void main(String[] var0) throws Exception {
       MOuter var1 = new MOuter();
       var1.go((int)(Math.random() * 100.0), (int)(Math.random() * 100.0));
    }
 }
 