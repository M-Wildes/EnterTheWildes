package meow.enterthewildes.registry;

import meow.enterthewildes.Enterthewildes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item WILD_GEM = register("wild_gem", new Item(new Item.Properties()));
    public static final Item WILD_CRYSTAL = register("wild_crystal", new Item(new Item.Properties()));
    public static final Item ANCIENT_SHARD = register("ancient_shard", new Item(new Item.Properties()));

    private static Item register(String name, Item item) {
        return Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(Enterthewildes.MOD_ID, name),
                item
        );
    }

    public static void registerItems() {
        // just to force class load
    }
}
