package iterator.iterators;

import iterator.channels.Channel;

public interface ChannelIterator {

	public boolean hasNext();

	public Channel next();
}
