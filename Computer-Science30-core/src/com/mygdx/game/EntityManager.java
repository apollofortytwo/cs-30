package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class EntityManager {

	ArrayList<Entity> enlist = new ArrayList<Entity>();
	
	
	public void update(){
		
	}
	
	public void renderSprite(){
		
	}
	
	public void renderOutline(ShapeRenderer sr){
		for(Entity entity: enlist){
			entity.renderOutline(sr);
		}
	}
	
	public void addEntity(Entity entity){
		enlist.add(entity);
	}
	
	
}
