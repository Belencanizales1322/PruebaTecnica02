
package AcesoADatos;

import HBCR21082023LogicaDeNegocio.Libros;

    
public class LibrosDAL {
    
     static String obtenerCampos() {
        return "r.Id,r.Titulo,r.Autor,r.Año";
    }
    
    // Metodo para obtener el SELECT a la tabla Rol y el TOP en el caso que se utilice una base de datos SQL SERVER
    private static String obtenerSelect(Libros plibro) {
        String sql;
        sql = "SELECT ";
        if (plibro.getTop_aux() > 0 && ComunDB.TIPODB == ComunDB.TipoDB.SQLSERVER) {
            // Agregar el TOP a la consulta SELECT si el gestor de base de datos es SQL SERVER y "getTop_aux" es mayor a cero
            sql += "TOP " + plibro.getTop_aux() + " ";
        }
        sql += (obtenerCampos() + " FROM Books r"); // Agregar los campos de la tabla de Rol mas el FROM a la tabla Rol con su alias "r"
        return sql;
    }
    
    // Metodo para obtener Order by a la consulta SELECT de la tabla Rol y ordene los registros de mayor a menor 
    private static String agregarOrderBy(Libros pBook) {
        String sql = " ORDER BY r.Id DESC";
        if (pBook.getTop_aux() > 0 && ComunDB.TIPODB == ComunDB.TipoDB.MYSQL) {
            // Agregar el LIMIT a la consulta SELECT de la tabla de Rol en el caso que getTop_aux() sea mayor a cero y el gestor de base de datos
            // sea MYSQL
            sql += " LIMIT " + pBook.getTop_aux() + " ";
        }
        return sql;
    }
}
