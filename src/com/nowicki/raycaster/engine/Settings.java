package com.nowicki.raycaster.engine;

import java.awt.Color;

public class Settings {

	enum DrawMode {
		NONE, SOLID, SOLID_SHADED, TEXTURED, TEXTURED_SHADED;
	}
	
	public static final int CEILING_COLOUR = new Color(80, 80, 80).getRGB();
	public static final int FLOOR_COLOUR = new Color(50, 50, 50).getRGB();
	
	public static final double WALKING_EFFECT_SCALE = 0.015;
	
	public static boolean debug = false;
	public static boolean fullScreen = false;
	public static boolean walkingEffect = false;
	public static DrawMode floors = DrawMode.SOLID;
	public static DrawMode walls = DrawMode.SOLID_SHADED;
	
	public static void toggleFullscreen() {
		fullScreen = !fullScreen;
	}
	
	public static void toggleWalkingEffect() {
		walkingEffect = !walkingEffect;
	}
	
	public static void toggleFloor() {
		if (floors == DrawMode.NONE) {
			floors = DrawMode.SOLID;
		}
		else if (floors == DrawMode.SOLID) {
			floors = DrawMode.SOLID_SHADED;
		}
//		else if (floors == DrawMode.SHADED) {
//			floors = DrawMode.TEXTURED;
//		}
		else {
			floors = DrawMode.NONE;
		}
	}
	
	public static void toggleWalls() {
		if (walls == DrawMode.SOLID) {
			walls = DrawMode.SOLID_SHADED;
		}
		else if (walls == DrawMode.SOLID_SHADED) {
			walls = DrawMode.TEXTURED;
		}
		else if (walls == DrawMode.TEXTURED) {
			walls = DrawMode.TEXTURED_SHADED;
		}	
		else {
			walls = DrawMode.SOLID;
		}
	}
}
