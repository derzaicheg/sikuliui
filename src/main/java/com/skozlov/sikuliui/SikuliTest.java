package com.skozlov.sikuliui;

import org.sikuli.script.*;


public class SikuliTest {

	public static void main(String[] args) {
			Screen s = new Screen();
			try{
				s.click("/src/main/resources/imgs/chrome.png");
				s.wait(3.0);
				s.compare("/src/main/resources/imgs/chrome_ready.png");
				s.click("/src/main/resources/imgs/search_chrome.png");
				s.type("http://drmtest2.adobe.com/AccessPlayer/player.swf" + Key.ENTER);
				s.wait("/src/main/resources/imgs/compare_player.png", 20);
				s.click("/src/main/resources/imgs/edt_player.png");
				s.type("a", Key.CTRL);
				s.type(Key.BACKSPACE);
				s.type("http://lic_acq_url");
				s.click("/src/main/resources/imgs/play_player.png");
			}
			catch(FindFailed e){
				e.printStackTrace();
			}
			
			
		
	}
}
