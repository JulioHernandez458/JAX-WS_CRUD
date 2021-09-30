package com.servicio;

import com.domain.Persona;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * @author julioh
*/
@WebService
public interface IPersonaService {
    
    @WebMethod
    public List<Persona> listarPersonas();
    
    @WebMethod
    public Persona encontrarPersonaPorId(Persona persona);
    
    @WebMethod
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    @WebMethod
    public void registrarPersona(Persona persona);
    
    @WebMethod
    public void modificarPersona(Persona persona);
    
    @WebMethod
    public void eliminarPersona(Persona persona);
    
}
