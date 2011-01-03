package tv.porst.swfretools.parser.tags;

import tv.porst.swfretools.parser.structures.RecordHeader;

public class DefineSoundTag extends Tag {

	public DefineSoundTag(final RecordHeader header, final int soundID, final int soundFormat,
			final int soundRate, final int soundSize, final int soundType, final long soundSampleCount,
			final byte[] soundData) {
		super(header);
	}

}