package com.myname.mymodid;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class Keybinds {
    public static final KeyBinding crouchSlideKey = new KeyBinding("key.mymod.crouchslide", Keyboard.KEY_C, "movement controls");
    public static final KeyBinding reloadKey = new KeyBinding("key.mymod.reload", Keyboard.KEY_R, "movement controls");
    public static final KeyBinding weaponModeKey = new KeyBinding("key.mymod.weaponmode", Keyboard.KEY_V, "movement controls");
    public static final KeyBinding dolphinDiveKey = new KeyBinding("key.mymod.dolphindive", Keyboard.KEY_X, "movement controls");
    public static final KeyBinding changeSightKey = new KeyBinding("key.mymod.changesight", Keyboard.KEY_T, "movement controls");

    public static KeyBinding[] keybinds;
    // use codechickenlib for network io and possibly obj rendering if taking it from hbm doesnt work out
    // remeber to use jni to link to libflextrace so we can profile ourselves

    public static void register() {
        keybinds = new KeyBinding[5];

        // register ts keybinds
        keybinds[0] = crouchSlideKey;
        keybinds[1] = reloadKey;
        keybinds[2] = weaponModeKey;
        keybinds[3] = dolphinDiveKey;
        keybinds[4] = changeSightKey;

        for (KeyBinding key: keybinds) {
            ClientRegistry.registerKeyBinding(key);
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority= EventPriority.NORMAL, receiveCanceled=true)
    public static void onEvent(InputEvent.KeyInputEvent event) {
        //debug
        System.out.println("DolphinDive key event: " + event);

        for (KeyBinding key: keybinds) {
            if (key.isPressed()) {
                switch (key.getKeyDescription()) {
                    case "key.mymod.crouchslide":
                        //
                    case "key.mymod.reload":
                        //
                    case "key.mymod.weaponmode":
                        //
                    case "key.mymod.dolphindive":
                        //
                    case "key.mymod.changesight":
                        //
                }
            }

        }

    }
}
