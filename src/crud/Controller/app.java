package crud.Controller;

import crud.Conexion.*;
import crud.Util.utilMetodos;
import crud.Consultas.*;

public class app {

	public static void main(String[] args) {
		
		conexionInterface conexionInterface = new conexionImplementacion();
		consultasInterface consultasInterface = new consultasImplementacion();
		boolean terminar = false;
		
		do {
			int opcion = utilMetodos.Menu();
			switch(opcion) {
			case 1: 
				consultasInterface.selectAll(conexionInterface.conexion());
				break;
			case 0:
				System.out.println("Hasta otra!");
				terminar = true;
				break;
			default:
				System.out.println("Eso no está entre las opciones");
				break;
			}
		} while (!terminar);
		
		
	}

}
