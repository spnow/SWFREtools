package tv.porst.swfretools.parser.structures;

import tv.porst.splib.io.Bits;
import tv.porst.splib.io.Flag;
import tv.porst.splib.io.UINT16;
import tv.porst.splib.io.UINT8;

public class ButtonRecord2 {

	public ButtonRecord2(final Bits buttonReserved, final Flag buttonHasBlendMode,
			final Flag buttonHasFilterList, final Flag buttonStateHitTest,
			final Flag buttonStateDown, final Flag buttonStateOver,
			final Flag buttonStateUp, final UINT16 characterID, final UINT16 placeDepth,
			final Matrix placeMatrix, final CxFormWithAlpha colorTransform,
			final FilterList filterList, final UINT8 blendMode) {
		// TODO Auto-generated constructor stub
	}

}