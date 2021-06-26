package noobanidus.mods.dtvoyage;

import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import net.minecraftforge.fml.common.Mod;

@Mod(DynamicTreesVoyage.MOD_ID)
public final class DynamicTreesVoyage {

    public static final String MOD_ID = "dtvoyage";

    public DynamicTreesVoyage() {
        RegistryHandler.setup(MOD_ID);
    }
}
