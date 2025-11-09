package meow.enterthewildes.item;

import meow.enterthewildes.EnterTheWildes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Example item: Wild Gem
    public static final Item WILD_GEM = new Item(new Item.Settings());

    public static void register() {
        Registry.register(
                Registries.ITEM,
                Identifier.of(EnterTheWildes.MOD_ID, "wild_gem"),
                WILD_GEM
        );
    }
}
