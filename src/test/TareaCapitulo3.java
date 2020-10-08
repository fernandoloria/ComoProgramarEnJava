/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ferna
 */
public class TareaCapitulo3 {

    private String _tituloTarea;
    private boolean _entregada;
    private int _capitulo;
    
    public TareaCapitulo3(String tituloTarea, boolean entregada, int capitulo) {
        this._tituloTarea = tituloTarea;
        this._entregada = entregada;
        this._capitulo = capitulo;
    }
    
    public void cargarVariables(String tituloTarea, boolean entregada, int capitulo) {
        this._tituloTarea = tituloTarea;
        this._entregada = entregada;
        this._capitulo = capitulo;
    }

    public String obtenerTitulo() {
        return _tituloTarea;
    }

    public boolean obtenerEntregada() {
        return _entregada;
    }

    public int obtenerCapitulo() {
        return _capitulo;
    }

}
