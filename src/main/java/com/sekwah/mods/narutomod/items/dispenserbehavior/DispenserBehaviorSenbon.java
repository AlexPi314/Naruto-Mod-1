package com.sekwah.mods.narutomod.items.dispenserbehavior;

import com.sekwah.mods.narutomod.entitys.projectiles.EntitySenbon;
import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.IProjectile;
import net.minecraft.world.World;

public final class DispenserBehaviorSenbon extends BehaviorProjectileDispense {
    /**
     * Return the projectile entity spawned by this dispense behavior.
     */
    @Override
    protected IProjectile getProjectileEntity(World par1World, IPosition par2IPosition) {
        EntitySenbon entityarrow = new EntitySenbon(par1World, par2IPosition.getX(), par2IPosition.getY(), par2IPosition.getZ());
        entityarrow.canBePickedUp = 1;
        return entityarrow;
    }
}