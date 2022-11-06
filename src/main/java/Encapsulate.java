public class Encapsulate {
    public static void main(String[] args) {
//        String s = "dfdsw)fs)sdf((f( ";
//        System.out.println(herm(s));
    }

    public static int herm(String s, char c, char d){
        int count = 0;
        for(int i=0; i <s.length(); i++){
            char sign = s.charAt(i);
            if (sign =='c'){ count ++; }
            else if (sign == 'd'){count --;}
        }
        return count;
    }
}
