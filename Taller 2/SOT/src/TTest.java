
class TTest implements Runnable {
   private Thread hilo;
   private String nombre;
   
   TTest( String name){
       nombre = name;
       System.out.println("Creando " +  nombre );
   }
   public void run() {
      System.out.println("Corriendo " +  nombre );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Hilo: " + nombre + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
     } catch (InterruptedException e) {
         System.out.println("Hilo " +  nombre + " Interrumpido.");
     }
     System.out.println("Hilo " +  nombre + " saliendo.");
   }
   
   public void start ()
   {
      System.out.println("Empezando " +  nombre );
      if (hilo == null)
      {
         hilo = new Thread (this, nombre);
         hilo.start ();
      }
   }
   public static void main(String args[]) {
	   
	      TTest R1 = new TTest( "Hilo 1");
	      R1.start();
	      
	      TTest R2 = new TTest( "Hilo 2");
	      R2.start();
   } 
}
     

