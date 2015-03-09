import scala.math.min

object strings  {

/*

   Write a function that accepts a sentence (string), and returns whether
   it represents a *declarative* sentence (i.e. ending in a period),
   *interrogatory* sentence (ending in a question mark), or an
   *exclamation* (ending in exclamation point) or is not a sentence
   (anything else).

   This may be the first time you write a conditional
   statement. (This needs the next chapter.)
   It makes sense to only make small changes at once and build
   up to final code. First you might just code it to check if a sentence is
   declarative or not. Then remember you can test further cases with
   ``else if (...)``.

   The function should return the string "interrogative", "declarative", or
   "exclamatory" for ?, ., or !; otherwise, it should return "unknown".
 */


   def getSentenceType(sentence : String) : String = {
     
      "unknown"
   }

/*
   Given a name as input.  Assume first and last names
   are separated by a space (no middle name).
   Print last name first followed by a comma
   and a space, followed by the first name.
   For example, if the input is
   ``"Marcel Proust"``, the output is ``"Proust, Marcel"``.

   If the name doesn't have any spaces in it (i.e. it is a single
   name, e.g. Madonna, return the name as is.
 */

   def getFormattedName(name : String) : String = {
     
      "name not calculated yet"
   }

}
