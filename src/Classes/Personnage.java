package Classes;

public class Personnage {
    private StrategieCombat st ;

    public Personnage(StrategieCombat st) {
        this.st = st;
    }

    public void Combattre(){
        st.combattre();
    }
}
