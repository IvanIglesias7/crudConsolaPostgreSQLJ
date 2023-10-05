package crud.DTO;

public class libroDTO {

	int id;
	String titulo;
	String autor;
	Long isbn;
	int edicion;
	
	public libroDTO(String titulo, String autor, Long isbn, int edicion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.edicion = edicion;
	}
	public libroDTO() {}
	@Override
	public String toString() {
		return "libroDTO [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", edicion=" + edicion + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	
	
	
}
