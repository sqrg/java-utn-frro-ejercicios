package logica;

import java.util.ArrayList;
import java.util.Iterator;

import entidades.Persona;

public class PersonaController {
	
	ArrayList<Persona> personas;
	
	public PersonaController()
	{
		personas = new ArrayList<Persona>();
		personas.add(new Persona("Santiago", "Quiroga", "36111222", true));
		personas.add(new Persona("Cesar", "Mecanico", "37444555", true));
	}
	
	public void add(Persona p)
	{
		personas.add(p);
	}
	
	public void delete(Persona p)
	{
		this.delete(p.getDni());
	}
	
	public void delete(String dni)
	{
		// http://stackoverflow.com/a/10502214
		Iterator<Persona> i = personas.iterator();
		
		while (i.hasNext())
		{
			Persona p = i.next();
			if (p.getDni() == dni)
			{
				i.remove();
			}
		}
	}
	
	public void update(String dni, Persona p)
	{
		Persona persona_old = this.getByDni(dni);
		this.delete(persona_old);
		this.add(p);
		// TODO: Que la deje en el mismo lugar
	}
	
	public Persona getByDni(Persona p)
	{
		return this.getByDni(p.getDni());
	}
	
	public Persona getByDni(String dni)
	{
		for (int i = 0; i < this.personas.size(); i++)
		{
			if (personas.get(i).getDni() == dni)
			{
				return personas.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Persona> getAll()
	{
		return this.personas;
	}
}
