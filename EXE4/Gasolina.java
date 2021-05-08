/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligarcarro;

/* 
Considerando -
0 litros para tanque vazio
100 para tanque cheio 
*/ 

public class Gasolina {
    private int litros;
    private boolean tanque_cheio;
    private boolean on;
    
    public Gasolina() {
        this.on = false;
        this.litros = 0;
        this.tanque_cheio = false;
    }
    
    public int getLitros(){
        return this.litros;
    }
    
    public void setLitros(int litros) {
        if (litros >= 0 && litros <= 100) {
            this.litros = litros;
            
            if (this.litros == 100) {
                this.tanque_cheio = true;
            }
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    public void setLigado(boolean on) {
        if (on == true) {
            if (this.litros > 0) {
                this.on = on;
            } else {
                System.out.println("Não é possível ligar, tanque está vazio!");
            }
        } else {
            this.on = on;
        }
        
    }
    
    public void abastecerTanque() {
        if (litros <= 100) {
            if (this.litros == 100) {
                this.tanque_cheio = true;
                System.out.println("Tanque já está cheio!");
            } else {
                this.litros += 10;
            }
        } else {
            this.tanque_cheio = true;
            System.out.println("Tanque já está cheio!");
        }
    }
    
    public void ligarMotor() {
        
        if (this.litros > 0) {
            this.on = true;
            this.litros -= 10;
            
            if (this.litros < 100) {
                this.tanque_cheio = false;
            }
            
            if (this.litros == 0) {
                this.on = false;
            }
            
        } else {
            this.on = false;
            System.out.println("Não é possível ligar, tanque está vazio!");
        }
        
    }
    
    public void statusCarro() {
        System.out.println("Litros: " + this.getLitros());
        System.out.println("Ligado? " + this.on);
        System.out.println("Tanque cheio? " + this.tanque_cheio);
    }
}
