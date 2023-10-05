package crud.DTO;

import java.sql.ResultSet;
import java.util.List;

public interface libroDTOInterface {

	public List<libroDTO> selectAllAListaDTO(ResultSet rs);
}
