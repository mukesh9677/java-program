public class builder {
    public static void main(String[]args){
StringBuilder sb=new StringBuilder("sham");
StringBuilder bs=sb;
sb.append("shamy");
if(sb==bs){
    System.out.println("same");
}else{
    System.out.println("not same");
}
    }  
}
