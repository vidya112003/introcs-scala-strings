import scala.math.min

object strings  {




   def getSentenceType(sentence : String) : String = {
       if (sentence.endsWith("."))
        {
            "declarative"
        }
        else if(sentence.endsWith("?"))
        {
           "interrogative"
        }
        else if(sentence.endsWith("!"))
        {
            "exclamatory"
        }
        else{
            "unknown"
}
   }



  def getFormattedName(name : String) : String = {
        val nameParts= name.split(" ") 
  var stringstr=" "
        if(name.contains(" ")){
stringstr= (nameParts{nameParts.length-1}+","+" ")
        for(a<-0 to nameParts.length-2){
stringstr+=(nameParts{a}+" ")
}
stringstr=stringstr.substring(0,stringstr.length-1)
stringstr
        }
        else if(!name.contains(" ")){
          (name)
        }
       else{
         "name not calculated yet"
      }

} 
}
