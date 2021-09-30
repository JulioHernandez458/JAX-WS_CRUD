package com.datos;

import com.domain.Persona;
import java.util.List;

/*
 * @author julioh
*/
public interface IPersonaDao {
    
    public List<Persona> findAllPersonas();
    
    public Persona findPersonaById(Persona persona);
    
    public Persona findPersonaByEmail(Persona persona);
    
    public void insertPersona(Persona persona);
    
    public void updatePersona(Persona persona);
    
    public void deletePersona(Persona persona);
    
}
