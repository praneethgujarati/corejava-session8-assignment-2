class NegativeAgeException extends Exception
{
  public NegativeAgeException(String msg)
  {
     super(msg);
  }
}

class AgeTest
{
    static void Age(int age) throws NegativeAgeException{
       if(age<0)
           throw new NegativeAgeException("Age can't be negative");
       else
           System.out.println("Input is valid");

     }

      public static void main(String args[])
      {
          try{
               Age(-25);
             }catch(NegativeAgeException nae){
                   nae.printStackTrace(); 
                 }
      }
}