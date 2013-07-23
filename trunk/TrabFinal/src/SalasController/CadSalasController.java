/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SalasController;

import SalasModel.CadSalas;
import SalasView.CadSalasJFrame;

/**
 *
 * @author Guilherme
 */
public class CadSalasController {
    private CadSalasJFrame view;
    private CadSalas model;
    
    public CadSalasController(CadSalasJFrame view, CadSalas model){
        this.view = view;
        this.model = model;
    }
    
}
