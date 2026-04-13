package com.ejemplo;


/**
 * Class OrdenReparacion_
 */
public class OrdenReparacion {

  //
  // Fields
  //

  private String id;
  private Dispositivo dispositivo;
  private Tecnico tecnico;
  
  //
  // Constructors
  //
  public OrdenReparacion () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (String newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public String getId () {
    return id;
  }

  /**
   * Set the value of dispositivo
   * @param newVar the new value of dispositivo
   */
  public void setDispositivo (Dispositivo newVar) {
    dispositivo = newVar;
  }

  /**
   * Get the value of dispositivo
   * @return the value of dispositivo
   */
  public Dispositivo getDispositivo () {
    return dispositivo;
  }

  /**
   * Set the value of tecnico
   * @param newVar the new value of tecnico
   */
  public void setTecnico (Tecnico newVar) {
    tecnico = newVar;
  }

  /**
   * Get the value of tecnico
   * @return the value of tecnico
   */
  public Tecnico getTecnico () {
    return tecnico;
  }

  //
  // Other methods
  //

}
