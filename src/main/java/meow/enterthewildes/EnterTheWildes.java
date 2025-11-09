package meow.enterthewildes;

import meow.enterthewildes.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class EnterTheWildes implements ModInitializer {
    public static final String MOD_ID = "enterthewildes";

    @Override
    public void onInitialize() {
        ModItems.register();
        ModItemGroups.register();
    }
}
