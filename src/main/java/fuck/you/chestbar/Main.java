package fuck.you.chestbar;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
		modid = Main.MODID,
		name = Main.NAME,
		version = Main.VERSION
)
public class Main
{
    public static final String MODID = "chestbar";
    public static final String NAME = "Chest Search Bar";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init( FMLInitializationEvent event )
    {
    	MinecraftForge.EVENT_BUS.register( new ChestSearchBar( ) );
    }
}
