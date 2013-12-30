package com.planepanic.game.gfx.ui;

import lombok.Setter;
import lombok.experimental.Accessors;

import com.planepanic.game.gfx.Image;
import com.planepanic.game.gfx.Resources;
import com.planepanic.game.model.Vector2d;

public class OrderButtons extends Image {

	@Accessors(chain = true) @Setter private Runnable callback;

	public OrderButtons(int xPosition, int yPosition, Resources buttonType) {
		super(buttonType, new Vector2d(xPosition, yPosition));
		this.setPriority(0.5f);
		this.setHitboxSize(new Vector2d(128, 64));
		this.setPosition(new Vector2d(xPosition - 64, yPosition - 32));
	}

	@Override
	public void draw2d() {
		super.draw2d();
	}

	@Override
	public void draw3d() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onClick() {
		if (this.callback != null) {
			this.callback.run();
			return true;
		}
		return false;
	}

}
