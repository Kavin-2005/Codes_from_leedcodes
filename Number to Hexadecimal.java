public class HexExample {
    public static void main(String[] args) {
        HexExample obj = new HexExample();
        String hexValue = obj.toHex(255);
        System.out.println("Hex value: " + hexValue);
    }

    public String toHex(int num) {
        String str = Integer.toHexString(num);
        return str;
    }
}

