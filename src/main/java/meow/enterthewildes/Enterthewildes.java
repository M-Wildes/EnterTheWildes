package meow.enterthewildes;

import meow.enterthewildes.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Enterthewildes implements ModInitializer {
    public static final String MOD_ID = "enterthewildes";

    // Custom creative tab
    public static final CreativeModeTab ENTER_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.WILD_GEM))
            .title(Component.translatable("itemgroup.enterthewildes.main"))
            .displayItems((context, entries) -> {
                entries.accept(ModItems.WILD_GEM);
                entries.accept(ModItems.WILD_CRYSTAL);
                entries.accept(ModItems.ANCIENT_SHARD);
            })
            .build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();

        Registry.register(
                BuiltInRegistries.CREATIVE_MODE_TAB,
                ResourceLocation.fromNamespaceAndPath(MOD_ID, "main"),
                ENTER_TAB
        );
    }
}
