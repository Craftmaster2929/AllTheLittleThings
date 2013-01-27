package me.craft.allthelittlethings;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class allthelittlethings extends JavaPlugin {

  private static final Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onEnable() {
		Listeners();
		log.info("[ATLT] AllTheLittleThings has been enabled!");
		
	}
	
	public void Listeners() {
		getServer().getPluginManager().registerEvents(new SignListener(this), this);
	}
	@Override
	public void onDisable() {
		log.info("[ATLT] AllTheLittleThings has been disabled!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		
		if (cmd.getName().equalsIgnoreCase("flyoff") && args.length == 1) {
			if (sender instanceof Player) {
			if (((Player)sender).hasPermission("flyoff.op")) {

				Player target = Bukkit.getPlayer(args[0]);
				
				if (target == null) {
					sender.sendMessage(ChatColor.RED + args[0] + " is not online!");
					return true;
				}
				target.setAllowFlight(false);
				target.sendMessage(ChatColor.BLUE + "You can no longer fly!");
				sender.sendMessage(ChatColor.BLUE + "They can no longer fly!");
				return true;
			}	
		}
			else {
				Player target = Bukkit.getPlayer(args[0]);
				if (target == null) {
					sender.sendMessage(ChatColor.RED + args[0] + " is not online!");
					return true;
				}
				target.setAllowFlight(false);
				target.sendMessage(ChatColor.BLUE + "You can no longer fly!");
				sender.sendMessage(ChatColor.RED + "They can no longer fly!");
			}
	}
		if (cmd.getName().equalsIgnoreCase("flyoff")) {
			if (sender instanceof Player) {
			((Player)sender).setAllowFlight(false);
			sender.sendMessage(ChatColor.BLUE + "You can no longer fly!");
			return true;
			}
			else {
				sender.sendMessage(ChatColor.RED + "Silly Goose!");
			}
		}
		
		
		
		
		
		if (cmd.getName().equalsIgnoreCase("kitinfo")) {
			if (sender instanceof Player) {
				if (!(args.length == 1)) {
					((Player)sender).sendMessage(ChatColor.BLUE + "/kitinfo [kit name]");
				}
				if (args[0].equalsIgnoreCase("spy")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 150 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "2 Invisibility potions, color cycler(An item that you can right click with to have your name tag change colors to disguise as other teams)");
					return true;
				}
				if (args[0].equalsIgnoreCase("cactus")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 15 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "[items]");
					return true;
				}
				if (args[0].equalsIgnoreCase("builder2")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 50 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "[items]");
					return true;
				}
				if (args[0].equalsIgnoreCase("elite2")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 450 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "Diamond sword, full set of diamond armor, 64 bottles o' enchanting, 16 bookshelves, anivl, flint and steel, 16 coal");
					return true;
				}
				if (args[0].equalsIgnoreCase("ender")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 60 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "2 Teleporters(Enderpearls), 2 grenades, iron sword - Sharpness I, chain chestplate - Fire protection II");
					return true;
				}
				if (args[0].equalsIgnoreCase("excavator")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 5 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "Diamond shovel - Efficiency V, iron helmet, leather chestplate");
					return true;
				}
				if (args[0].equalsIgnoreCase("farmer")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 35 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "Diamond hoe, diamond shovel, 64 dirt, 64 sand, 64 bonemeal, 8 buckets, 16 ice, 16 seeds, 16 carrots, 16 potatoes, 16 saplings, 16 pumpkins, 16 melons, 16 cacti");
					return true;
				}
				if (args[0].equalsIgnoreCase("firefighter")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 35 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "Leather helmet, leather chestplate - Fire Protection I, stone sword, water bucket, and ladders");
					return true;
				}
				if (args[0].equalsIgnoreCase("ghost")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 10 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "3 Splash potions of invisibility");
					return true;
				}
				if (args[0].equalsIgnoreCase("ghost2")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 35 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "6 Splash potions of invisibility");
					return true;
				}
				if (args[0].equalsIgnoreCase("ghost3")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires 90 priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "5 Splash potions of invisibiltiy, diamond sword - Sharpness I, and flint & steel");
					return true;
				}
				if (args[0].equalsIgnoreCase("miner")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "[items]");
					return true;
				}
				if (args[0].equalsIgnoreCase("paratrooper")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "[items]");
					return true;
				}
				if (args[0].equalsIgnoreCase("pyro2")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "[items]");
					return true;
				}
				if (args[0].equalsIgnoreCase("smelter")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "[items]");
					return true;
				}
				if (args[0].equalsIgnoreCase("trader")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "[items]");
					return true;
				}
				if (args[0].equalsIgnoreCase("warrior3")) {
					((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
					((Player)sender).sendMessage(ChatColor.BLUE + "[items]");
					return true;
				}
					if (args[0].equalsIgnoreCase("archer")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "Leather helmet, leather chestplate, bow, 12 arrows");
						return true;
					}
					if (args[0].equalsIgnoreCase("tools")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "Wood pickaxe, wood axe, wood shovel, wood sword");
						return true;
					}
					if (args[0].equalsIgnoreCase("default")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "4 Bottles o' Enchanting, stone pickaxe");
						return true;
					}
					if (args[0].equalsIgnoreCase("medic")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "8 Healing potions, 8 steak");
						return true;
					}
					if (args[0].equalsIgnoreCase("warrior")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "Iron sword, chain helmet, gold chestplate");
						return true;
					}
					if (args[0].equalsIgnoreCase("warrior2")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "Diamond sword, 4 steak, iron helmet, iron chestplate, gold boots");
						return true;
					}
					if (args[0].equalsIgnoreCase("builder")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "2 Stacks of cobblestone, 2 stacks of cracked stone brick, 16 wood planks");
						return true;
					}
					if (args[0].equalsIgnoreCase("demo")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "6 TNT, 8 redstone torches");
						return true;
					}
					if (args[0].equals("food")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "12 Steak");
						return true;
					}
					if (args[0].equals("food2")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "64 Steak, 4 golden apples");
						return true;
					}
					if (args[0].equals("pyro")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "Chain helmet - Fire protection II, iron sword - Fire aspect I");
						return true;
					}
					if (args[0].equals("elite")) {
						((Player)sender).sendMessage(ChatColor.GREEN + "This kit requires x priority.");
						((Player)sender).sendMessage(ChatColor.BLUE + "Diamond sword, 12 steak, diamond helmet, diamond chestplate, chain leggings, gold boots, 2 golden apples, iron pickaxe, bottle o' enchanting");
						return true;
					}
					else {
						((Player)sender).sendMessage(ChatColor.RED + "That is not a kit!");
						return true;
					}
		    }
			else {
				sender.sendMessage(ChatColor.BLUE + "Console, you don't need a kit!");
			}
		}
		
		
		
		
		
		if (cmd.getName().equalsIgnoreCase("faq")) {
			if (sender instanceof Player) {
				if (args.length == 0) {
			((Player)sender).sendMessage(ChatColor.GREEN + "FAQ:");
			((Player)sender).sendMessage(ChatColor.RED + "How do I get priority?");
			((Player)sender).sendMessage(ChatColor.BLUE + "You get priority from voting and/or donating at mcwalls.enjin.com.");
			
			((Player)sender).sendMessage(ChatColor.RED + "How do I join a game?");
			((Player)sender).sendMessage(ChatColor.BLUE + "Join a game by using /join or right clicking a join sign when the countdown to join hits 0.");
			
			((Player)sender).sendMessage(ChatColor.RED + "How do I play 'The Walls'?");
			((Player)sender).sendMessage(ChatColor.BLUE + "The Walls is a pvp map in which you have 15 minutes to prepare and gather materials. After that 15 minutes ends, the 4 dividing walls fall and the teams battle.");
			
			((Player)sender).sendMessage(ChatColor.RED + "Can I be an admin/op? :D");
			((Player)sender).sendMessage(ChatColor.BLUE + "NO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			
			((Player)sender).sendMessage(ChatColor.RED + "Who owns this server?");
			((Player)sender).sendMessage(ChatColor.BLUE + "Craftmaster2929 and JohnnyTk64");
			
			((Player)sender).sendMessage(ChatColor.RED + "I just got teamkilled, what do I do?????");
			((Player)sender).sendMessage(ChatColor.BLUE + "Report the player with a screenshot proving they teamkilled in the forums on mcwalls.enjin.com.");
			
			((Player)sender).sendMessage(ChatColor.RED + "What do I get for donating?");
			((Player)sender).sendMessage(ChatColor.BLUE + "Donating gets you 2 priority for every 1 dollar. $5-The prefix [$], access to the donator lounge, a name listed in the donator lounge. $10+ - Everything previously listed, plus a custom prefix on request. To donate, just use /buy");
			return true;
		}
}
			else {
				sender.sendMessage(ChatColor.BLUE + "Silly console, FAQ is for kids!");
				return true;
			}
	}
		if (cmd.getName().equalsIgnoreCase("rules")) {
			if (sender instanceof Player) {
				if (args.length == 0) {
			((Player)sender).sendMessage(ChatColor.GREEN + "Rules:");
			((Player)sender).sendMessage(ChatColor.BLUE + "1.)" + ChatColor.RED + "DO NOT" + ChatColor.BLUE + " Team kill.");
			((Player)sender).sendMessage(ChatColor.BLUE + "2.)" + ChatColor.RED + "ALWAYS" + ChatColor.BLUE + " Be respectful.");
			((Player)sender).sendMessage(ChatColor.BLUE + "3.)" + ChatColor.RED + "DO NOT" + ChatColor.BLUE + " Damage the walls in any way.");
			((Player)sender).sendMessage(ChatColor.BLUE + "4.)" + ChatColor.RED + "DO NOT" + ChatColor.BLUE + " Spam or use caps.");
			((Player)sender).sendMessage(ChatColor.BLUE + "5.)" + ChatColor.RED + "DO NOT" + ChatColor.BLUE + " Build over the walls.");
			((Player)sender).sendMessage(ChatColor.BLUE + "6.)" + ChatColor.RED + "DO NOT" + ChatColor.BLUE + " Hack.");
			((Player)sender).sendMessage(ChatColor.BLUE + "7.)" + ChatColor.RED + "DO NOT" + ChatColor.BLUE + " Rage.");
			((Player)sender).sendMessage(ChatColor.BLUE + "8.)" + ChatColor.RED + "NO" + ChatColor.BLUE + " Excessive camping.");
			return true;
		}
}
			else {
				sender.sendMessage(ChatColor.BLUE + "Silly console, you should know the rules already!");
				return true;
			}
	}
	
	if (cmd.getName().equalsIgnoreCase("murder") {
		if (args.length == 1) {
		if (sender instanceof Player) {
		if (((Player)sender).hasPermission("murder.op") {
			Bukkit.getPlayer(args[0]).setHealth(0);
		}
	}
	else {
		Bukkit.getPlayer(args[0]).setHealth(0);
	}
		}
		else {
			sender.sendMessage(ChatColor.BLUE + "Proper use: /murder [target]");
		}
	}
	
		
		
		
		
				return false;
	}
}
	
