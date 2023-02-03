package iterator.channels;

public class Channel {
	private String name;
	private ChannelLanguageEnum lang;
	private ChannelTypeEnum type;


	public Channel(String name, ChannelLanguageEnum lang, ChannelTypeEnum type){
		this.name =name;
		this.lang =lang;
		this.type =type;
	}

	public String getName() {
		return name;
	}

	public ChannelLanguageEnum getLang() {
		return lang;
	}

	public ChannelTypeEnum getType() {
		return type;
	}

	@Override
	public String toString(){
		return "Name="+this.name +", Language="+this.lang +", Type="+this.type;
	}

}
