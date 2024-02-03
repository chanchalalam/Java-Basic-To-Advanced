public class bits {
        public static String represent(int number) {
            if (number == 0) {
                return "0";
            }
            StringBuilder bits = new StringBuilder();
            for (int i = 0; i < 32; i++) {  // Assuming 32-bit representation
                bits.append((number & 1));
                number >>>= 1;  // Unsigned right shift
            }
            if (number < 0) {
                bits = new StringBuilder(Integer.toBinaryString(Integer.parseInt(bits.toString(), 2) ^ 0xFFFFFFFF));  // Flip bits and add 1
            }
            return bits.toString();
        }
    }
    

