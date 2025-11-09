package meow.enterthewildes.datagen;

import meow.enterthewildes.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;

public class ETWItemModelProvider extends FabricModelProvider {

    public ETWItemModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(net.minecraft.data.models.BlockModelGenerators blockStateModelGenerator) {
        // we don't have blocks yet
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        // each simple item = "generated" model
        simpleItem(itemModelGenerator, ModItems.WILD_GEM);
        simpleItem(itemModelGenerator, ModItems.WILD_CRYSTAL);
        simpleItem(itemModelGenerator, ModItems.ANCIENT_SHARD);
    }

    private void simpleItem(ItemModelGenerators gen, Item item) {
        gen.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }
}
