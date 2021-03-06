package maxhyper.dynamictreestbl;

import com.ferreusveritas.dynamictrees.ModConstants;
import maxhyper.dynamictreestbl.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= DynamicTreesTBL.MODID, name= DynamicTreesTBL.NAME, dependencies = DynamicTreesTBL.DEPENDENCIES, updateJSON = "https://github.com/DynamicTreesTeam/DynamicTreesVersionInfo/blob/master/Add-ons/TheBetweenlands.json?raw=true")
public class DynamicTreesTBL {
	
	public static final String MODID = "dynamictreestbl";
	public static final String NAME = "Dynamic Trees for The Betweenlands";
	public static final String DEPENDENCIES = "required-after:" + ModConstants.DYNAMICTREES_LATEST + ";required-after:thebetweenlands@[3.7.3,)";
	
	@Mod.Instance
	public static DynamicTreesTBL instance;
	
	@SidedProxy(clientSide = "maxhyper.dynamictreestbl.proxy.ClientProxy", serverSide = "maxhyper.dynamictreestbl.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		proxy.postInit();
	}
	
}
