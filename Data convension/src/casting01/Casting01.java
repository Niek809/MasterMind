package casting01;

public class Casting01 {
    public static void main(String[] args) {

        short waarde = 128;
        byte castedByte = (byte) waarde; 
        System.out.println("Casted short (128) to byte: " + castedByte);

        byte anotherByte = 127;
        System.out.println("Initial byte value: " + anotherByte);

        anotherByte++;
        System.out.println("After adding 1: " + anotherByte); 

        anotherByte++;
        System.out.println("After adding 1 again: " + anotherByte);
    }    
}



	}