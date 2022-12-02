
package pe.edu.cientifica.test;



import pe.edu.cientifica.config.Conexion;
import pe.edu.cientifica.daoImp.CarreraDaoImp;
import pe.edu.cientifica.model.Carrera;


public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }
        //AlumnoDaoImp impl = new AlumnoDaoImp();
        //if(impl.validar("kevin", "123")){
        //   System.out.println("correcto");
        //}else{
        //    System.out.println("incorrecto");
       
        CarreraDaoImp cdi =  new CarreraDaoImp();
        System.out.println(cdi.create(new Carrera(0, "Ing.Industrial")));
        //System.out.println(cdi.update(new Carrera(5,"Nutricion")));
        //System.out.println(cdi.delete(1));
        //System.out.println(cdi.read(3));
        //System.out.println(cdi.readAll());
    }
    
}

