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
    * @param name nombre  para persona 
    * @param number numero de telefono para la persona
    * @return 
    */
   public void enterNumber(String name, String number)
   {
     agenda.put(name,number); //añadicmos un nuevo numero 
   }
   
   /**
    * busqueda de nombre
    * @param name nombre que queremos buscar
    * @return devuelve el numero de la persona si existe en lista
    */
   public String lookupNumber(String name)
   {
       return (agenda.get(name));//buscamos y devolvemos un numero
   }
   
   /**
   * Print all keys
   * @param 
   * @return devuelve todos los nombres de la lista
   */
  public void printAllNames()
  {
     System.out.println(agenda.keySet()); // Devuelve una "Collection" con los valores del keys
  }
}
