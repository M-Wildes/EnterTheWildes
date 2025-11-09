package meow.enterthewildes.EnterthewildesDataGenerator;

import meow.enterthewildes.Enterthewildes;
import meow.enterthewildes.datagen.ETWItemModelProvider;
import meow.enterthewildes.datagen.ETWLangProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ETWDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ETWItemModelProvider::new);
        pack.addProvider(ETWLangProvider::new); // ✅ this now works with the fixed constructor
    }

    @Override
    public String getEffectiveModId() {
        return Enterthewildes.MOD_ID;
    }
}
