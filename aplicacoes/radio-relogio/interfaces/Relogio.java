/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.time.LocalTime;

public interface Relogio extends AparelhoEletronico {

    LocalTime getHoras();
    void setHoras(LocalTime horas);
    
}
