/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertdatatype;

/**
 *
 * @author LENOVO
 */
class ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l; return (short) i;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d = 10.25; float f = (float) d;
        byte b = (byte) methodOne((long)f); System.out.println(b);
    }  
}
