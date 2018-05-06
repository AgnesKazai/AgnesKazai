public class F35 extends Aircraft {

    public F35() {
        this.setType(Type.F35);
        this.setMaxAmmo(12);
        this.setBaseDamage(50);
    }
    public boolean isPriority() {
        return true;
    }
}
