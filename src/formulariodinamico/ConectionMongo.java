package formulariodinamico;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alonso Escamilla
 */
public abstract class ConectionMongo {
    
    DB baseDeDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject();

    //Conexión a base de datos
    public ConectionMongo() {
        try {
            Mongo mongo = new Mongo ("localhost" , 27017);
            baseDeDatos = mongo.getDB("formularios");
            coleccion = baseDeDatos.getCollection("formulario");
            System.out.println("Conexión exitosa");
        } catch (UnknownHostException ex) {
            Logger.getLogger(ConectionMongo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //INSERT
//    public boolean insert(String nombre,String apellido, String edad){
//        document.put("nombre", nombre);
//        document.put("apellido", apellido);
//        document.put("edad", edad);
//        coleccion.insert(document);
//        return true;
//    }
    
    
    //INSERT
    public abstract boolean insert();
    
//    //SELECT
//    public void mostrar(){
//        DBCursor cursor  = coleccion.find();
//        while(cursor.hasNext()){
//            System.out.println(cursor.next());
//        }
//    }
//    //UPDATE
//    public boolean actualizar(String accionVieja, String accionNueva){
//        document.put("accion", accionVieja);
//        BasicDBObject docNuevo = new BasicDBObject();
//        docNuevo.put("accion", accionNueva);
//        coleccion.findAndModify(document, docNuevo);
//        return true;
//    }
//    //DELETE
//    public boolean eliminar(String accion){
//        document.put("accion", accion);
//        coleccion.remove(document);
//        return true;
//    }
    
}
