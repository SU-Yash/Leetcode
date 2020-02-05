public class DefangIpAddress_1108 {
        public static String defangIPaddr(String address) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < address.length(); i++){
                char c = address.charAt(i);
                if (c == '.') sb.append("[.]");
                else sb.append(c);
            }
            return sb.toString();
        }
        public static void main(String[] args){
            System.out.println(defangIPaddr("255.0.0.1"));
        }
}