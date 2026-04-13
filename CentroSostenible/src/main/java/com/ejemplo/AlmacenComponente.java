package com.ejemplo;


import java.util.*;


/**
 * Class AlmacenComponente
 */
public class AlmacenComponente {

  //
  // Fields
  //

  private ArrayList<Componente> componentes;
  
  //
  // Constructors
  //
  public AlmacenComponente () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of componentes
   * @param newVar the new value of componentes
   */
  public void setComponentes (ArrayList<Componente> newVar) {
    componentes = newVar;
  }

  /**
   * Get the value of componentes
   * @return the value of componentes
   */
  public ArrayList<Componente> getComponentes () {
    return componentes;
  }

  //
  // Other methods
  //

}
