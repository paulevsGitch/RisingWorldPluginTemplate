package template;

import net.risingworld.api.Plugin;

public class PluginTemplate extends Plugin {
	@Override
	public void onEnable() {
		System.out.println("Template plugin enabled!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("Template plugin disabled!");
	}
}
