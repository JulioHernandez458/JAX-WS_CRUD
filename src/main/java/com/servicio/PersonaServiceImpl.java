package com.servicio;

import com.datos.IPersonaDao;
import com.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/*
 * @author julioh
*/
@Stateless
@WebService(endpointInterface = "com.servicio.IPersonaService")
public class PersonaServiceImpl  implements IPersonaService{

    @Inject
    private IPersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersonas() {
       return personaDao.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
