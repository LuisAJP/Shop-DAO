/**
 * 
 */
package Presentacion.Comando.Cliente;

import Negocio.Clientes.SACliente;
import Negocio.Clientes.TransferCliente;
import Negocio.FactoriaSA.FactoriaSA;
import Presentacion.Comando.Comando.Comando;
import Presentacion.Comando.Comando.IDEvento;
import Presentacion.Controlador.RespuestaComando;


public class ComandoConsultarCliente implements Comando {
	
	@Override
	public RespuestaComando ejecutar(Object datos) {
		SACliente saCliente = FactoriaSA.getInstance().getSACliente();

		TransferCliente result = saCliente.consultarClienteSA((Integer) datos);

		RespuestaComando respuestaComando = new RespuestaComando();
		if (result != null) {
			respuestaComando.setEvento(IDEvento.EVENTO_CONSULTAR_CLIENTE);
			respuestaComando.setDatos(result);
		}
		else {
			respuestaComando.setEvento(IDEvento.EVENTO_ERROR);
		}

		return respuestaComando;
	}
}