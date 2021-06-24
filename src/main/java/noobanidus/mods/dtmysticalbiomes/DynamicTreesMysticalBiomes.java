package noobanidus.mods.dtmysticalbiomes;

import com.ferreusveritas.dynamictrees.api.registry.RegistryHandler;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraftforge.fml.common.Mod;

@Mod(DynamicTreesMysticalBiomes.MOD_ID)
public final class DynamicTreesMysticalBiomes {

    public static final String MOD_ID = "dtmysticalbiomes";

    public DynamicTreesMysticalBiomes() {
        RegistryHandler.setup(MOD_ID);
    }
}
