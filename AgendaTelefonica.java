import java.util.HashMap; // importacion de libreria

public class AgendaTelefonica
{
   private HashMap<String,String> Agenda;
   
   //constructo de hashmap
   public AgendaTelefonica()
   {
       this.Agenda = new HashMap<>();
   }
   
   /**
    * nueva numero y persona en la agenda
    */
   public void enterNumber(String name, String number)
   {
     Agenda.put(name,number);
   }
   
   /**
    * busqueda de nombre
    */
   public String lookupNumber(String name)
   {
       return (Agenda.get(name));
   }
   
}
