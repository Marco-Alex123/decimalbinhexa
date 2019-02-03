package decimalbinhexa;
public class Decimalbinhexa {
    
    public static void main(String[] args) {
        System.out.println(deciabin(5));
        System.out.println(Hexa(285));
        System.out.println(deciacualquie(15,4));
    }
    public static String deciabin(int num){
        String aum="";
        if(num<2){
            System.out.print(num);
            
            
       
            }else {
          deciabin(num/2);
            System.out.print(num%2);
            
        } 
        return "";
    }
    public static String Hexa(int s) {
        String result = "";
       
        int opc = s % 16;

        if (s == 0) {
            return "";
        } else {
            switch (opc) {
                case 10:
                    result = "A";
                    break;
                case 11:
                    result = "B";
                    break;
                case 12:
                    result = "C";
                    break;
                case 13:
                    result = "D";
                    break;
                case 14:
                    result = "E";
                    break;
                case 15:
                    result = "F";
                    break;
                default:
                    result = opc+result;
                    break;
            }
            return Hexa( s/ 16) + result;
        }
    }
    public static String deciacualquie(int num, int base){
        if(num<base){
            System.out.print(num);
            
            
       
            }else {
          deciabin(num/base);
            System.out.print(num%base);
            
        } 
        return "";
    }
    
}
