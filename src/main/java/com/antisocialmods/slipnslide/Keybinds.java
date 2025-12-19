package com.antisocialmods.slipnslide;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class Keybinds {
    public static final KeyBinding crouchSlideKey = new KeyBinding("key.slipnslide.crouchslide", Keyboard.KEY_C, "movement controls");
    public static final KeyBinding reloadKey = new KeyBinding("key.slipnslide.reload", Keyboard.KEY_R, "movement controls");
    public static final KeyBinding weaponModeKey = new KeyBinding("key.slipnslide.weaponmode", Keyboard.KEY_V, "movement controls");
    public static final KeyBinding dolphinDiveKey = new KeyBinding("key.slipnslide.dolphindive", Keyboard.KEY_X, "movement controls");
    public static final KeyBinding changeSightKey = new KeyBinding("key.slipnslide.changesight", Keyboard.KEY_T, "movement controls");

    public static KeyBinding[] keybinds;
    // use codechickenlib for network io and possibly obj rendering if taking it from hbm doesnt work out
    // remeber to use jni to link to libflextrace so we can profile ourselves

    public static void register() {
        keybinds = new KeyBinding[5];

        // register ts keybinds
        System.out.println("registering keybinds for DolphinDive");
        keybinds[0] = crouchSlideKey;
        keybinds[1] = reloadKey;
        keybinds[2] = weaponModeKey;
        keybinds[3] = dolphinDiveKey;
        keybinds[4] = changeSightKey;

        for (KeyBinding key: keybinds) {
            ClientRegistry.registerKeyBinding(key);
            System.out.println("registered keybind " + key.getKeyDescription());
        }
    }

}
