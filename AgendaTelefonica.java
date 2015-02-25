import java.util.HashMap; // importacion de libreria

public class AgendaTelefonica
{
   private HashMap<String,String> agenda;
   
   //constructo de hashmap
   public AgendaTelefonica()
   {
       this.agenda = new HashMap<>();
   }
   
   /**
    * nueva numero y persona en la agenda
    */
   public void enterNumber(String name, String number)
   {
     agenda.put(name,number); //añadicmos un nuevo numero 
   }
   
   /**
    * busqueda de nombre
    */
   public String lookupNumber(String name)
   {
       return (agenda.get(name));//buscamos y devolvemos un numero
   }
   
   /**
   * Print all keys
   */
  public void printAllNames()
  {
     System.out.println(agenda.keySet()); // Devuelve una "Collection" con los valores del keys
  }
}
