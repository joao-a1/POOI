
package ligarcarro;


public class LigarCarro {

    
    public static void main(String[] args) {
        Gasolina car = new Gasolina();
        
        car.setLitros(100);
        
        car.statusCarro();
        
        car.ligarMotor();
        car.ligarMotor();
        
        car.statusCarro();
        
        car.setLitros(12);

        car.ligarMotor();
        car.setLigado(false);
        
        car.statusCarro();
    }
    
}
