package java.game.parts.CMS_Brakes;

import java.game.parts.rgearpart.reciprocatingrgearpart.brake.*;

public class brake_caliper_Wilwood_4_L extends DiscBrake
{
	public brake_caliper_Wilwood_4_L( int id )
	{
		super( id );
		name = "Wilwood Dynapro 4 piston";
		description = "Paintable";
		brand_new_prestige_value = 42.49;

		value = tHUF2USD(35.579);
		friction_pad		= 1.0;
		number_of_calipers	= 2.0;
	}
}