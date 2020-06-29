package id.dana.protectionproxy;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version WeaponImplementation, v 0.1 2019-11-21 16:19 by Billy Kaleb Hananto
 */
public class WeaponImplementation implements ActivateWeapon {

    @Override
    public void activateGun() {
        System.out.println("Activating Gun");
    }

    @Override
    public void activateBomb() {
        System.out.println("Activating Bomb");
    }

    @Override
    public void activateNuclear() {
        System.out.println("Activating Nuclear");
    }

    @Override
    public void activateHidroBomb() {
        System.out.println("Activating Hidrogen Bomb");
    }
}
