package util;

import java.awt.*;

public class Constants {
    private Constants() {}

    public static final int SCREEN_X = 800;
    public static final int SCREEN_Y = 800;
    public static final int OBJECT_SIZE = 200;

    public static final int DOWNLEFT  = 0;
    public static final int DOWN      = 1;
    public static final int DOWNRIGHT = 2;
    public static final int RIGHT     = 3;
    public static final int UPRIGHT   = 4;
    public static final int UP        = 5;
    public static final int UPLEFT    = 6;
    public static final int LEFT      = 7;
    public static final int MOVESPEED = 2;

    public static final Color BACKGROUND_COLOR = new Color(0x2c3e50);
    public static final Color BORDER_COLOR = new Color(0x34495e);
    public static final Color OBJECT_COLOR = new Color(0xf1c40f);

    public static final Color COLLISION_COLOR_0 = new Color(0.2f, 0.6f, 0.86f, 1.0f);
    public static final Color COLLISION_COLOR_1 = new Color(0.2f, 0.6f, 0.86f, 0.9f);
    public static final Color COLLISION_COLOR_2 = new Color(0.2f, 0.6f, 0.86f, 0.8f);
    public static final Color COLLISION_COLOR_3 = new Color(0.2f, 0.6f, 0.86f, 0.7f);
    public static final Color COLLISION_COLOR_4 = new Color(0.2f, 0.6f, 0.86f, 0.6f);
    public static final Color COLLISION_COLOR_5 = new Color(0.2f, 0.6f, 0.86f, 0.5f);
}

