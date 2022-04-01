import java.util.Scanner;

public class ColorMedio {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // al inicio me daban colorA y colorB en String pero es mas corto pasarlos a enteros 
        int colorA = Integer.parseInt(in.nextLine().substring(2),16); 
        int colorB = Integer.parseInt(in.nextLine().substring(2),16);
        String m = Integer.toHexString((colorA + colorB)/2).toUpperCase();
        // entre 0xAAAAAA y 0xCCCCCC da 0xBBBBBBB
        // entre 0xCCCCCC y 0x888888 da 0xAAAAAAA

        System.out.println("0x" + m);
        in.close();
    }
}
