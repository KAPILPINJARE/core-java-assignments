package com.capgemini.jlayer.model;

import java.io.FileInputStream;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Test
{
	public static void main(String[] args)
	{
		try (FileInputStream fis = new FileInputStream("demo.mp3"))
		{
		    Player player = new Player(fis);
		    player.play();
		} catch (IOException | JavaLayerException e) {
		    e.printStackTrace();
		}

	}

}
