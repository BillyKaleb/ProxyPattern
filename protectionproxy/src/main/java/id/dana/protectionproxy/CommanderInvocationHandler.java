package id.dana.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version CommanderInvocationHandler, v 0.1 2019-11-21 16:21 by Billy Kaleb Hananto
 */
public class CommanderInvocationHandler implements InvocationHandler {

    ActivateWeapon activateWeapon;

    public CommanderInvocationHandler(ActivateWeapon activateWeapon) {
        this.activateWeapon = activateWeapon;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(activateWeapon, args);
    }
}
