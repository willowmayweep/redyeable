package willowmayweep.redyeable;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Redyeable implements ModInitializer {
	public static final String MOD_ID = "redyeable";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("check out my tumblr!!! tumblr.com/willow-may-weep");
	}
}