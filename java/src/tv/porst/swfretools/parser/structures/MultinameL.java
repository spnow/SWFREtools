package tv.porst.swfretools.parser.structures;

public class MultinameL implements IMultiname {

	private final EncodedU30 nsSet;

	public MultinameL(final EncodedU30 nsSet) {
		this.nsSet = nsSet;
	}

	@Override
	public int getBitLength() {
		return nsSet.getBitLength();
	}

	@Override
	public int getBitPosition() {
		return nsSet.getBitPosition();
	}

	/**
	 * Returns the
	 *
	 * @return The
	 */
	public EncodedU30 getNsSet() {
		return nsSet;
	}

}
