package aadd.pruebas;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import aadd.controlador.TorneUM;
import aadd.persistencia.bean.TipoTorneo;
import aadd.persistencia.dto.EquipoTorneoDTO;
import aadd.persistencia.dto.TorneoDTO;

public class TestJPA {
	@Test
	public void testCrearTorneo() {
		TorneUM controlador = TorneUM.getTorneUM();
		TorneoDTO torneo = new TorneoDTO("Torneo Cocina", null, 5, TipoTorneo.OTROS);
		torneo.setCalle("Calle Unodos");
		torneo.setCiudad("Murcia");
		torneo.setCodigoPostal(30100);
		torneo.setNumero(24);
		torneo = controlador.createTorneo(torneo);
		assertTrue(torneo.getIdTorneo() != null);
	}

	@Test

	public void testCrearEquipo()

	{
		TorneUM controlador = TorneUM.getTorneUM();
		EquipoTorneoDTO equipoCreado = controlador.createEquipo(1, 1, "campeonísimos");
		assertTrue(equipoCreado.getJugadores().size() == 1);
	}
}