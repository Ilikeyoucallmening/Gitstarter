// Always try to put `public` in front of class, even though the class defaults
//  to `public` when the keyword is omitted, this insn't always true in some languages
//  so its best to get in the habit of putting public there
// Also note that originally, your spelling of FirstVariable was without the B
//  and was spelled FirstVariale, watch out for misspellings, because they will
//  cause lots of issues that are hard to find.
public class FirstVariable
{
  public static void main (String[] args)
  {
    String message = "Initial value";
    // The reason you code didn't compile is because you had putln instead of
    //  println in the line below
    System.out.println(message);

    message = "Modified value";
    System.out.println(message);
  }
}
