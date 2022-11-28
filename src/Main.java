import Classes.CombattreCouteau;
import Classes.CombattrePistolet;
import Classes.Guerrier;
import Classes.StrategieCombat;

public class Main {
    public static void main(String[] args) {
        StrategieCombat strategie_Couteau =new CombattreCouteau();
        StrategieCombat strategie_Pistolet = new CombattrePistolet();
        Guerrier Player1 = new Guerrier(strategie_Couteau);
        Guerrier Player2 = new Guerrier(strategie_Pistolet);
        Player2.Combattre();
        Player1.Combattre();



    }
}