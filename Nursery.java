public class Nursery
 { 
     public static void main(String[] args)
       {
          int n=99;
          int i;
          for(i=99;i>0;i--)
            {  
               if(i>1)
               {
                  System.out.println(i+" bottles of beer on the wall");
		}
               else
		{
                  System.out.println(i+" bottle of beer on the wall");
                }
               System.out.println(i+" bottles of beer");
               System.out.println("Take one down");
               System.out.println("Pass it around");
               if(i==1)
                  System.out.println("no bottles of beer on the wall");
             } 
         }
   } 
