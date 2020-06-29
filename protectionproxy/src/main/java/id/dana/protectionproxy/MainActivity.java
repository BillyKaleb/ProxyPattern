package id.dana.protectionproxy;

import android.os.Bundle;

import java.lang.reflect.Proxy;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ActivateWeapon activateWeapon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activateWeapon = new WeaponImplementation();
        getMinnonActivationWeapon(activateWeapon).activateNuclear();
    }

    private ActivateWeapon getCommanderActivationWeapon(ActivateWeapon activateWeapon) {
        return (ActivateWeapon) Proxy.newProxyInstance(activateWeapon.getClass().getClassLoader(),
            activateWeapon.getClass().getInterfaces(),
            new CommanderInvocationHandler(activateWeapon));
    }

    private ActivateWeapon getMinnonActivationWeapon(ActivateWeapon activateWeapon) {
        return (ActivateWeapon) Proxy.newProxyInstance(activateWeapon.getClass().getClassLoader(),
            activateWeapon.getClass().getInterfaces(),
            new MinionInvocationHandler(activateWeapon));
    }
}
