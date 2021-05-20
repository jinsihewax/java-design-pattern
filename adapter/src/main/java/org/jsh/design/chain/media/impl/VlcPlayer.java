package org.jsh.design.chain.media.impl;

import org.jsh.design.chain.media.AdvancedMediaPlayer;
import org.springframework.stereotype.Component;

@Component("vlc")
public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// 什么也不做
	}
}