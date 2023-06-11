package productos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

	@Test
	void nombreProductoTest() {
		Producto producto = new Producto("Pantalon");
		String nombre = producto.getNombre();
	
		assertEquals(nombre, "Pantalon");
	}

}
