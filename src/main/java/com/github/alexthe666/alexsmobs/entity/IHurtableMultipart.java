package com.github.alexthe666.alexsmobs.entity;

import net.minecraft.entity.LivingEntity;

public interface IHurtableMultipart {

    void onAttackedFromServer(LivingEntity parent, float damage);
}
