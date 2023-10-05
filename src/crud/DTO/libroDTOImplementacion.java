package crud.DTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class libroDTOImplementacion implements libroDTOInterface {

	@Override
	public List<libroDTO> selectAllAListaDTO(ResultSet rs) {
		
		List<libroDTO> listaLibrosDTO = new ArrayList<libroDTO>();
		try {
			
			while(rs.next()) {
				
				libroDTO libroDTO = new libroDTO();
				libroDTO.setTitulo(rs.getString("titulo"));
				libroDTO.setAutor(rs.getString("autor"));
				libroDTO.setIsbn(rs.getLong("isbn"));
				libroDTO.setEdicion(rs.getInt("edicion"));
				
				listaLibrosDTO.add(libroDTO);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaLibrosDTO;
	}

	
}
