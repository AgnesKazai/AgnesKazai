public class Aircraft {
    private Type type;
    private int maxAmmo;
    private int baseDamage;
    private int ammo;

    public Aircraft() {
    }

    protected void setType(Type type) {
        this.type = type;
    }

    protected void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    protected void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getAmmo() {
        return ammo;
    }

    public int fight() {
        int allDamage = baseDamage * ammo;
        this.ammo = 0;
        return allDamage;
    }

    public int refill(int number) {
        if (number < this.maxAmmo) {
            this.ammo = number;
            return 0;
        } else {
            this.ammo = this.maxAmmo;
            return number - this.maxAmmo;
        }
    }

    public String getType() {
        return this.type.toString();
    }

    public void getStatus() {
        System.out.println("Type: " + getType() + ", " + "Ammo: " + this.ammo + ", "
                + "Base Damage: " + this.baseDamage + ", " + "All Damage: " + this.baseDamage * this.ammo);
    }
}
