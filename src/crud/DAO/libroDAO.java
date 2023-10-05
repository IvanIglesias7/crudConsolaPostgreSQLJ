package crud.DAO;

public class libroDAO {

	int id;
	String titulo;
	String autor;
	long isbn;
	int edicion;
	
	public libroDAO(String titulo, String autor, long isbn, int edicion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.edicion = edicion;
	}

	public libroDAO() {}
	
	
	@Override
	public String toString() {
		return "libroDAO [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", edicion=" + edicion + "]";
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

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	
	
}
