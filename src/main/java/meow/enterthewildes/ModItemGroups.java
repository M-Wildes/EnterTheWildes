package meow.enterthewildes;

import meow.enterthewildes.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroups {

    public static void register() {
        // Add the Wild Gem to the Ingredients creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.WILD_GEM);
        });
    }
}
