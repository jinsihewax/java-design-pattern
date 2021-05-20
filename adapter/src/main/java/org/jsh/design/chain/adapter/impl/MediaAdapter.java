package org.jsh.design.chain.adapter.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.jsh.design.chain.adapter.MediaPlayer;
import org.jsh.design.chain.media.AdvancedMediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MediaAdapter implements MediaPlayer {

	@Autowired
	private Map<String, AdvancedMediaPlayer> mediaPlayers = new ConcurrentHashMap<String, AdvancedMediaPlayer>(2);

	AdvancedMediaPlayer advancedMusicPlayer;

	// public MediaAdapter(String audioType) {
	// if (audioType.equalsIgnoreCase("vlc")) {
	// advancedMusicPlayer = new VlcPlayer();
	// } else if (audioType.equalsIgnoreCase("mp4")) {
	// advancedMusicPlayer = new Mp4Player();
	// }
	// }

	private void getAdvancedMediaPlayer(String audioType) {
		advancedMusicPlayer = mediaPlayers.get(audioType);
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			getAdvancedMediaPlayer(audioType);
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			getAdvancedMediaPlayer(audioType);
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}