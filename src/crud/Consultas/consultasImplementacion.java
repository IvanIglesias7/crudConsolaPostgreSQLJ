package crud.Consultas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import crud.DTO.libroDTO;
import crud.DTO.libroDTOImplementacion;
import crud.DTO.libroDTOInterface;

public class consultasImplementacion implements consultasInterface {

	libroDTOInterface libroDTOInterface = new libroDTOImplementacion();
	List<libroDTO> listaDTO = new ArrayList<libroDTO>();
	@Override
	public void selectAll(Connection conexion) {

		try
	    {	      
		Statement st = conexion.createStatement();// Creo el statement
	    ResultSet rs = st.executeQuery("SELECT * FROM gbp_almacen.gbp_alm_cat_libros;");// Ejecuto la query y recibo el resultado
	    
	    listaDTO = libroDTOInterface.selectAllAListaDTO(rs);
	    for (libroDTO libroDTO : listaDTO) {
			System.out.println(libroDTO.toString());
		}
	      st.close();// Cierro statement
	    }
	    catch (Exception e)
	    {
	      System.err.println("Error! ");
	      System.err.println(e.getMessage());
	    }
	  }

	@Override
	public void selectPorIsbn(Connection conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarLibro(Connection conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarLibro(Connection conexion) {
		// TODO Auto-generated method stub
		
	}

	
}
