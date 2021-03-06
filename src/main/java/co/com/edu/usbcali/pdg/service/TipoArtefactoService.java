package co.com.edu.usbcali.pdg.service;

import java.util.List;

import co.com.edu.usbcali.pdg.dto.TipoArtefactoDTO;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
public interface TipoArtefactoService {

	void crearTipoArtefacto(TipoArtefactoDTO TipoArtefactoDTO) throws Exception;

	TipoArtefactoDTO consultarTipoArtefacto(Long tiarId) throws Exception;

	void eliminarTipoArtefacto(TipoArtefactoDTO tipoArtefactoDTO) throws Exception;

	void actualizarTipoArtefacto(TipoArtefactoDTO tipoArtefactoDTO) throws Exception;

	List<TipoArtefactoDTO> consultarTipoArtefactosActivos() throws Exception;

}
