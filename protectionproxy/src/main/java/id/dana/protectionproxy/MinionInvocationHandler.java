package id.dana.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version MinionInvocationHandler, v 0.1 2019-11-21 16:22 by Billy Kaleb Hananto
 */
public class MinionInvocationHandler implements InvocationHandler {

    ActivateWeapon activateWeapon;

    public MinionInvocationHandler(ActivateWeapon activateWeapon) {
        this.activateWeapon = activateWeapon;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().equals("activateGun") || method.getName().equals("activateBomb")) {
                return method.invoke(activateWeapon, args);
            } else {
                throw new IllegalAccessException();
            }
        } catch (IllegalAccessException e) {
            System.out.println("Dont have the rights!");
        }
        return null;
    }
}
