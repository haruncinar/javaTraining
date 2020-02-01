
public class Main {
    public static void main(String[] args) {
        //Double: 8 Byte
        //Float: 4 Byte
        
        //Dönüşüm sırası: int --> float --> double
        
        int a = 22 / 7;
        float b = 22f / 7f;
        double c = 22d / 7d;
        
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        //double'ın daha detaylı sonuç vermesi 8 byte olmasından dolayı..
        
        /*
        float k = 5f;
        int m =k;
        */ //Yukarıdaki gibi float'dan int'a dönüşüm denersek java hata verecektir.
        //Tam tersi dönüşüm denediğimizde sorun olmayacaktır.
        int k=5;
        float m = k;
        System.out.println("m:"+m);
        
        //yine bir eklemeyle sorunu çözebilriiz....
        float u = 5f;
        int x = (int) u;
        System.out.println("x:"+x);
        
        
        //Double-Float arasında farkı daha da net görebiliriz...
        double sayi1 = 40.29d;
        double sayi2 = 34d;
        double sayi3 = 94.34d;
        System.out.println("3 sayının ortalaması: "+ (sayi1+sayi2+sayi3)/3);
        
        float sayi4 = 40.29f;
        double sayi5 = 34f;
        double sayi6 = 94.34f;
        System.out.println("3 sayının ortalaması: "+ (sayi4+sayi5+sayi6)/3);
        
        
        
    }
    
}
