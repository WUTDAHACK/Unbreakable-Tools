package omgitzbunnygirl.unbreakabletools;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UnbreakableTools.MODID)
public class UnbreakableTools
{
    public static final String MODID = "unbreakabletools";

    public UnbreakableTools() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistrationHandler.ITEMS.register(modEventBus);
    }
}
