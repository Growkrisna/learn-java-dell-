package belajar.src;
public class App {
    public static void main(String[] args) throws Exception {
        Integer iniinteger = 100;
        Long inilong = 100L;

        Short inishort = null;
        // System.out.println(inishort);
        System.out.println("hi");
        inishort = iniinteger.shortValue();
        // System.out.println(iniinteger);

        int[] array = new int[10];
        array[0] = 100;
        array[2] = 200;
        array[1] = 300;

        // System.out.println(array[1]);

        while (iniinteger < 110){
            iniinteger++;
            
            if (iniinteger % 2 == 0){
                continue;
            };
            // System.out.println(iniinteger);
        }

        for(int value : array){
            // System.out.println(value);
        }

        coba();
    }

    static void coba(){
        System.out.println("coba");
    }
}
