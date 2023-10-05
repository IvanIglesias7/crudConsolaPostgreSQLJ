package crud.Consultas;

import java.sql.Connection;

public interface consultasInterface {

	public void selectAll(Connection conexion);
	
	public void selectPorIsbn(Connection conexion);
	
	public void modificarLibro(Connection conexion);
	
	public void eliminarLibro(Connection conexion);
}
