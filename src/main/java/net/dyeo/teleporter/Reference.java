package net.dyeo.teleporter;

/*
 * Reference contains the mod version and mod id for forge purposes
 */
public final class Reference
{
	public static boolean isDebug = false;

	public static final String MODID = "teleporter";
	public static final String VERSION = "1.6.0";

	// public static boolean useCustomTextures = false;

	public static boolean useDiamonds = true;
	public static int numTeleporters = 1;

	public static boolean teleportPassiveMobs = true;
	public static boolean teleportHostileMobs = true;

	public static String teleporterBlockId = "teleporterBlock";
	public static String enderTeleporterBlockId = "enderTeleporterBlock";
}