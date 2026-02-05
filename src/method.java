public class method {

    static void sayhello(String hello, String name){
        System.out.println(hello + ", " + name);
    }
    static void code(int no){
        System.out.println("Nomor: " + no);
    }

    static int value(int a, int b) {
        var total = a + b;
        return total;
    }

    static int value(int a){
        var c = a + a;
        return c;
    }

    static int hitung(int a, String operasi, int b){
        switch (operasi) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                return 0;
        }
    }

    static void congrat(String nama, int... nilai){
        var total = 0;
        for(var n : nilai){
            total += n;
        }

        var nilaiakhir = total / nilai.length;

        if(nilaiakhir >= 75){
            System.out.println("Selamat " + nama + ", Anda lulus dengan nilai " + nilaiakhir);
        } else {
            System.out.println("Maaf " + nama + ", Anda tidak lulus dengan nilai " + nilai);
        }
    }

    static int factorial(int d){
        if (d == 1){
            return 1;
        } else {
            return d * factorial(d - 1);
        }
    }

    static String sayHello(String nama){
        String hello = "Hello, " + nama;
        if(!nama.isBlank()){
            String name = "Hi, " + nama;
            return name;
        }else{
            return hello;
        }

        // System.out.println(hi);
    }

    public static void main(String[] args) {
        sayhello("Hello", "Krisna");
        code(10);
        var result = value(10);
        System.out.println("Hasil: " + result);

        System.out.println("Hitung tambah: " + hitung(100, "+", 50));
        System.out.println("Hitung kurang: " + hitung(100, "-", 50));


        // int[] nilai = {100, 60, 75, 80, 90};
        congrat("Hiee",100, 60, 75, 80, 90);

        System.out.println("Faktorial: " + factorial(5));

        System.out.println(sayHello("Krisna"));
    }
}
