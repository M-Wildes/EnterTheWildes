package meow.enterthewildes.datagen;

import meow.enterthewildes.Enterthewildes;
import meow.enterthewildes.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ETWLangProvider extends FabricLanguageProvider {
    public ETWLangProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(output, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {

    }

    public void generateTranslations(TranslationBuilder translationBuilder) {
        // Items
        translationBuilder.add(ModItems.WILD_GEM, "Wild Gem");
        translationBuilder.add(ModItems.WILD_CRYSTAL, "Wild Crystal");
        translationBuilder.add(ModItems.ANCIENT_SHARD, "Ancient Shard");

        // Creative tab
        translationBuilder.add("itemgroup." + Enterthewildes.MOD_ID + ".main", "Enter the Wildes");
    }
}
