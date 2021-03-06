package wildycraft.entity;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import wildycraft.Wildycraft;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityBlueDragon extends EntityMob implements IRangedAttackMob {
	private EntityAIArrowAttack rangedAttack = new EntityAIArrowAttack(this,
			1.0F, 40, 10.0F);
	private EntityAIAttackOnCollide meleeAttack = new EntityAIAttackOnCollide(
			this, EntityLivingBase.class, 0.91F, false);
	
	private boolean attacked;

	public EntityBlueDragon(World par1World) {
		super(par1World);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this,
				EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this,
				EntityCow.class, 0, true));
		this.isImmuneToFire = true;

		this.setSize(1.5f,2.0f);
		if (par1World != null && !par1World.isRemote) {
			this.setCombatTask();
		}
	}

	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(12, Integer.valueOf(0));
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	public boolean isAIEnabled() {
		return true;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(47.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(450.0D);
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound() {
		return "mob.enderdragon.growl";
	}

	public boolean attackEntityAsMob(Entity par1Entity) {

		if (super.attackEntityAsMob(par1Entity)) {
			attacked = true;
			return true;
		} else {
			attacked = true;
			return false;
		}
	}


	/**
	 * Called frequently so the entity can update its state every tick as
	 * required. For example, zombies and skeletons use this to react to
	 * sunlight and start to burn.
	 */
	public void onLivingUpdate() {
		if(getRebound() > -100){
			setRebound(getRebound()-1);
			if(getRebound() < 0){
				int i = getRebound() * -1;
				double x = Math.cos(i/8.0);
				double y = Math.sin(i/8.0);
				this.worldObj.spawnParticle("reddust", this.posX + x * 2, this.posY+ i*0.02, this.posZ + y*2, 0,1,1);
			}
		} else {
			setRebound(300);
		}
		super.onLivingUpdate();
		if(attacked){
			this.setCombatTask();
			attacked = false;
		}
	}

	/**
	 * Called when the mob's health reaches 0.
	 */
	public void onDeath(DamageSource par1DamageSource) {
		super.onDeath(par1DamageSource);
	}

	/**
	 * Drop 1 items of this living's type
	 */
	protected void dropFewItems(boolean par1, int par2) {
		int var3;
		int var4;
		
		var3 = 1 + rand.nextInt(par2 + 1);

		for (var4 = 0; var4 < var3; ++var4) {
			double j = Math.random() * 100;
			this.dropItem(Wildycraft.blueDragonhide, rand.nextInt(4) + 2);
			if (j > 80) {
				this.dropItem(Items.bone, 10);
			} else if (j > 65) {
				this.dropItem(Wildycraft.addybar, 1);
			} else if (j > 50) {
				this.dropItem(Wildycraft.bodyRune, 20);
			} else if (j > 40) {
				this.dropItem(Wildycraft.deathRune, 17);
			} else if (j > 37) {
				this.dropItem(Wildycraft.antiDragonShield, 1);
			} else if (j > 34) {
				this.dropItem(Wildycraft.runebar, 1);
			} else if (j > 12) {
				this.dropItem(Items.gold_ingot, 10);
			} else if (j > 6) {
				this.dropItem(Items.iron_axe, 1);
			} else if (j > 5) {
				this.dropItem(Wildycraft.draconicVisage, 1);
			} else {
				this.dropItem(Items.beef,15);
			}

		}

	}

	protected void dropRareDrop(int par1) {
		this.dropItem(Wildycraft.addybar, 1);
	}

	public void setCombatTask() {
		this.tasks.removeTask(this.meleeAttack);
		this.tasks.removeTask(this.rangedAttack);
		
		if (this.rand.nextInt(10) > 3) {
			this.tasks.addTask(4, this.rangedAttack);
		} else {
			this.tasks.addTask(4, this.meleeAttack);
		}
	}

	/**
	 * Attack the specified entity using a ranged attack.
	 */
	public void attackEntityWithRangedAttack(EntityLivingBase par1EntityLiving,
			float par2) {
		int attack = rand.nextInt(4);
		if(attack >= 2){
			EntityDragonfire var2 = new EntityDragonfire(this.worldObj, this,
					par1EntityLiving, 1.6F, 2.0F);

			var2.setDamage(var2.getDamage() + 4);

			var2.setFire(100);

			this.playSound("random.fizz", 1.0F, 1.0F / (this.getRNG()
					.nextFloat() * 0.4F + 0.8F));
			this.worldObj.spawnEntityInWorld(var2);

			attacked = true;
		} else {
			EntityIceBlast var2 = new EntityIceBlast(this.worldObj, this,
					par1EntityLiving, 1.6F, 2.0F);

			var2.setDamage(var2.getDamage() + 20);
			
			this.playSound("random.fizz", 1.0F, 1.0F / (this.getRNG()
					.nextFloat() * 0.4F + 0.8F));
			this.worldObj.spawnEntityInWorld(var2);

			attacked = true;
		}
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);

		this.setCombatTask();
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		super.writeEntityToNBT(par1NBTTagCompound);
	}
	
	public int getRebound(){
		 return this.dataWatcher.getWatchableObjectInt(12);
	 }
	 public void setRebound(int par1){
	 	this.dataWatcher.updateObject(12, par1);
	 }
	
	 public boolean attackEntityFrom(DamageSource par1DamageSource, float par2){
		 if(this.getRebound() < 0){
			 if(par1DamageSource.getEntity() instanceof EntityLivingBase){
				 ((EntityLivingBase)par1DamageSource.getEntity()).attackEntityFrom(Wildycraft.causeRecoilDamage(), par2 * 0.8f);
			 }
			 return false;
		 }
				
		 return super.attackEntityFrom(par1DamageSource, par2);
	 }
	 
	public boolean getCanSpawnHere()
    {
        return this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }
	
}
