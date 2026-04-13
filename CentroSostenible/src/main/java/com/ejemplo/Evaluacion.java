package com.ejemplo;


/**
 * Class Evaluacion_
 */
public class Evaluacion {

  //
  // Fields
  //

  private Orden orden;
  private Tecnico tecnico;
  private Dispositivo dispositivo;
  
  //
  // Constructors
  //
  public Evaluacion () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of orden
   * @param newVar the new value of orden
   */
  public void setOrden (Orden newVar) {
    orden = newVar;
  }

  /**
   * Get the value of orden
   * @return the value of orden
   */
  public Orden getOrden () {
    return orden;
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

  //
  // Other methods
  //

}
