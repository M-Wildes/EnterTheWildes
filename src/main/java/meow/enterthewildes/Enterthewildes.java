package meow.enterthewildes;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

public class Enterthewildes implements ModInitializer {
    public static final String MOD_ID = "enterthewildes";

    // Define your item using vanilla settings
    public static final Item WILD_GEM = new Item(new Item.Properties());

    @Override
    public void onInitialize() {
        Registry.register(
                BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath(MOD_ID, "wild_gem"),
                WILD_GEM
        );

        // add to Ingredients tab (pick whatever fits)
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.accept(WILD_GEM);
        });

        System.out.println("Item registered: wild_gem");
    }

}
