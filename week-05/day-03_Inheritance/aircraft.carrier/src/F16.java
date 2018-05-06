public class F16 extends Aircraft {

    public F16() {
        this.setType(Type.F16);
        this.setMaxAmmo(8);
        this.setBaseDamage(30);
    }

    public boolean isPriority() {
        return false;
    }
}
