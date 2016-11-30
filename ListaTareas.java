import java.util.ArrayList;
/**
 * Descripcion de la clase ListaTareas.
 * 
 * @author (oschariv) 
 * @version (1.0 - 28/11/2016)
 */
public class ListaTareas
{
    // creamos el array para guardar las tareas
    private ArrayList<String> listaDeTareas;
    
    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
       // inicializamos el objeto ArrayList
        listaDeTareas = new ArrayList<String>();
       
    }

    /**
     * Imprime por pantalla todas las tareas guardadas. 
     */
    public void printTareas()
    {
       System.out.println(listaDeTareas); 
    }
    
    /**
     * Permite añadir una nueva tarea.
     */
    public void addTarea(String nuevaTarea)
    {
        listaDeTareas.add(nuevaTarea);
    }
    
    /**
	  * Devuelve el numero de tareas existentes
	  */	 
	public int getNumeroTareas()
	{
		return listaDeTareas.size();
	}
	
	/**
	 * Elimina una tarea.
	 * La posicion inicial es "cero"
	 */
	public void deleteTarea(int posicion)
	{
	    listaDeTareas.remove(posicion);
	}
}
