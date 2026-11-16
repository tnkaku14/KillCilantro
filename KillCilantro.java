public class KillCilantro{
   public static String killCilantro(String text){
      String newText = text;
      int FindVal = 0;
      if(newText.indexOf("cilantro")==0){
         newText = "parsley";
         newText += text.substring(8);
      }
      while (newText.indexOf("cilantro")>0){
         FindVal = newText.indexOf("cilantro");
         String tempText = newText;
         newText = newText.substring(0,FindVal);
         newText += "parsley";
         newText += tempText.substring(FindVal+8);
      }
      return newText;
   }
   public static void main(String[] args){
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
      }
}