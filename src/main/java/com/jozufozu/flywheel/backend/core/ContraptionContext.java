package com.jozufozu.flywheel.backend.core;

import com.jozufozu.flywheel.backend.gl.shader.FogSensitiveProgram;
import com.simibubi.create.content.contraptions.components.structureMovement.render.ContraptionProgram;

import net.minecraft.util.ResourceLocation;

public class ContraptionContext extends WorldContext<ContraptionProgram> {

	public static final ContraptionContext INSTANCE = new ContraptionContext();

	public ContraptionContext() {
		super(new ResourceLocation("create", "contraption"), new FogSensitiveProgram.SpecLoader<>(ContraptionProgram::new));
	}


}