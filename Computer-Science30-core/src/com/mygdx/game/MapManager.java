package com.mygdx.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MapManager {
	EntityManager em;
	TileManager tm;

	MapManager() {
		em = new EntityManager();
		tm = new TileManager(20,20);
		tm.initMap();
		
	}
	
	public void renderSprites(){
		
	}
	
	public void renderOutline(ShapeRenderer sr){
		tm.renderOutline(sr);
		em.renderOutline(sr);
	}

	public void update(){
		tm.update();
		em.update();
	}
	public void addEntity(int x, int y) {
		em.addEntity(new Entity(TileManager.TILE_WIDTH * x, TileManager.TILE_HEIGHT * y));
	}

}
