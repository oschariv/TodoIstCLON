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
     * La posicion inicial es "CERO".
     * El metodo supone que un valor de 1 en el parametro indica
     * la primera tarea, valor de 2 la segunda, etc.
     */
    public void deleteTarea(int posicion)
    {
        posicion = posicion - 1;
        if (esValidoElIndice(posicion) == true)
        {
            listaDeTareas.remove(posicion);
        }
    }
    
    /**
     * Metodo que comprueba si un indice valido y devuelve true
     * en caso afirmativo o false en otro caso.
     * El metodo supone que un valor de 0 cuando hay una tarea es un valor
     * de indice valido pero un valor de 1 si solo hay una tarea no es valido.
       */
    public boolean esValidoElIndice(int indice)
    {
        boolean valido = false;
        if (indice >= 0 && indice < listaDeTareas.size())
        {
           valido = true; 
        }
        return valido;
    }
    
    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer,
     * false en el otro caso.
     */
    public boolean hayTareasPendientes()
    {
        return !listaDeTareas.isEmpty();
    }
    
    /**
     * Metodo que imprime todas las tareas existentes, una por linea.
     * (Se usa el bucle FOR).
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de tarea.
     */
    public void mostrarTareas()
    {
        int num = 1;
        for (String tarea : listaDeTareas)
        {
            System.out.println(num + ". " + tarea);
            num = num + 1;
        }
    }
    
    /**
     * Muestra todas las tareas (una por linea) que contengan un determinado texto
     * pasado como parametro con su numeracion asociada correcta. si no hay ninguna
     * tarea que contenga el texto indicado, se muestra ¡un mensaje de error!.
     * Si hay tareas coincidentes, tras la lista, se muestra el numero 
     * de tareas coincidentes.
     */
    public void mostrarTareasCoincidentes(String contenido)
    {
        int num = 1;
        int cont = 0;
        for (String tarea : listaDeTareas)
        {
            if (tarea.contains(contenido))
            {
                System.out.println(num + ". " + tarea);
                cont = cont + 1;
            }
            num = num + 1;
           
        }
        
        
        if (cont == 0)
        {
            System.out.println("CONTENIDO NO LOCALIZADO. PRUEBE OTRA VEZ");
        }
        else
        {
            System.out.println(cont + " tareas encontradas para " + contenido);
        }
    }
    
    /**
     * Muestra todas las tareas existentes (usando un bucle WHILE)
     * y que esten numerdads.
     */
    public void mostrarTareas2()
    {
        int contador = 0;
        while (contador < listaDeTareas.size())
        {
            System.out.println((contador + 1) + ". " + listaDeTareas.get(contador));
            contador++;
        }
    }
    
    /**
     * Muestra por pantalla las primera "N" tareas indicads como parametro.
     * En caso de que haya menos de "N" tareas se muestran todas.
     */
    public void mostrarPrimerasTareas(int numeroTareasAMostrar)
    {
        int contador = 0;
        while(contador < numeroTareasAMostrar && contador < listaDeTareas.size())
        {
            System.out.println((contador + 1) + ". " + listaDeTareas.get(contador));
            contador++;        
        }
    }
    
    /**
     * Devuelve true o false si hay al menos una tarea que contien el texto
     * indicado como parametro. NO MUESTRA NADA POR PANTALLA.
     */
    public boolean hayTareasCoincidentes(String textoABuscar)
    {
        boolean coincidencia = false;
        int contador = 0;
        
        while(contador < listaDeTareas.size() && coincidencia == false)
        {
            if (listaDeTareas.get(contador).contains(textoABuscar))
            {
                coincidencia = true;           
            }
            contador++;
        }
        return coincidencia;        
    }
    
}
