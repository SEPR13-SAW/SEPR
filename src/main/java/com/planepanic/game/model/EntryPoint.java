package com.planepanic.game.model;

import com.planepanic.game.model.orders.Vector2d;

/**
 * A class to represent Entry points.
 * 
 * @author Mantas
 */
public final class EntryPoint extends PointOfInterest{

	public EntryPoint(Vector2d position) {
		super(position);
	}
	
	public void addPlane(){
		// TODO make it do something
	}

	@Override
	public void draw2d() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw3d() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onClick() {
		return false;
	}
}


	