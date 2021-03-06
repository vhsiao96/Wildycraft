package wildycraft.entity;

import java.util.Iterator;
import java.util.List;

import wildycraft.Wildycraft;
import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.ForgeModContainer;

public class EntityWerewolf extends EntityMob{
	
	private EntityAIAttackOnCollide attackAI = new EntityAIAttackOnCollide(this, EntityLivingBase.class, 1.0D, false);
	
	private int jumpTicks = 0;
	
	private boolean persistenceRequired = false;
	
	 public EntityWerewolf(World par1World){
	     super(par1World);
	     this.tasks.addTask(0, new EntityAISwimming(this));
	     this.tasks.addTask(2, attackAI);
	     this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	     this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	     this.tasks.addTask(8, new EntityAILookIdle(this));
	     this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	     this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	     this.setSize(0.6F, 1.8F);
	 }
	 
	 protected void applyEntityAttributes(){
	     super.applyEntityAttributes();
	     this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
	     this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
	     this.getCreatureAttribute();
	 }
	 
	 protected void entityInit()
     {
             super.entityInit();
             this.dataWatcher.addObject(12, Integer.valueOf(0));
     }
	 
	 protected boolean isAIEnabled()
	    {
	        return true;
	    }
	 
	 public void onLivingUpdate()
	 {
		 if(getType() == 1){
			 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(27.0D);
		     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
		 }
		 super.onLivingUpdate();
	  }
	 
	 public void onDeath(DamageSource par1DamageSource) {
			if (ForgeHooks.onLivingDeath(this, par1DamageSource)) {
				return;
			}

			Entity var2 = par1DamageSource.getEntity();

			if (this.scoreValue >= 0 && var2 != null) {
				var2.addToPlayerScore(this, this.scoreValue);
			}

			if (var2 != null) {
				var2.onKillEntity(this);
			}

			this.dead = true;

			if (!this.worldObj.isRemote) {
				int var3 = 0;

				if (var2 instanceof EntityPlayer) {
					var3 = EnchantmentHelper
							.getLootingModifier((EntityLivingBase) var2);
				}

				captureDrops = true;
				capturedDrops.clear();
				int var4 = 0;

				if (!this.isChild()
						&& this.worldObj.getGameRules().getGameRuleBooleanValue(
								"doMobLoot")) {
					this.dropFewItems(this.recentlyHit > 0, var3, par1DamageSource);
					this.dropEquipment(this.recentlyHit > 0, var3);

					if (this.recentlyHit > 0) {
						var4 = this.rand.nextInt(200) - var3;

						if (var4 < 5) {
							this.dropRareDrop(var4 <= 0 ? 1 : 0);
						}
					}
				}

				captureDrops = false;

				if (!ForgeHooks.onLivingDrops(this, par1DamageSource,
						capturedDrops, var3, recentlyHit > 0, var4)) {
					for (EntityItem item : capturedDrops) {
						worldObj.spawnEntityInWorld(item);
					}
				}
			}

			this.worldObj.setEntityState(this, (byte) 3);
			/*if (par1DamageSource.getEntity() instanceof EntityPlayer) {
				EntityPlayer ep = (EntityPlayer) par1DamageSource.getEntity();
				ep.addStat(Wildycraft.DagannothSlayer, 1);
			}*/
		}
	 
	 protected void dropFewItems(boolean par1, int par2,
				DamageSource par1DamageSource) {
			int var3 = 1 + this.rand.nextInt(1 + par2);
			int var4;
			double k = rand.nextInt(1000);
			if (k > 990) {
				this.dropItem(Wildycraft.blueCharm, 1);
			} else if (k > 950) {
				this.dropItem(Wildycraft.greenCharm, 1);
			} else if (k > 910) {
				this.dropItem(Wildycraft.crimsonCharm, 1);
			} else if (k > 500) {
				this.dropItem(Wildycraft.goldCharm, 1);
			} 
			for (var4 = 0; var4 < var3; ++var4) {
				double i = rand.nextInt(100);
				if (i > 90) {
					this.dropItem(Items.chicken, 5);
				} else if (i > 80) {
					this.dropItem(Items.beef, 5);
				} else if (i > 70) {
					this.dropItem(Items.beef, 5);
				} else if (i > 60) {
					this.dropItem(Items.iron_axe, 1);
					this.dropItem(Items.iron_sword, 1);
				} else if (i > 50) {
					this.dropItem(Wildycraft.mithrilbar, 3);
				} else if (i > 40) {
					this.entityDropItem(new ItemStack(Items.potionitem, 1, 16), 1);
				} else if (i > 30) {
					this.dropItem(Items.coal, 3);
					this.dropItem(Item.getItemFromBlock(Blocks.iron_ore), 5 + rand.nextInt(5));
				} else if (i > 20) {
					this.dropItem(Items.flint_and_steel, 1);
					this.dropItem(Item.getItemFromBlock(Blocks.torch), 3);
				} else if (i > 10) {
					this.dropItem(Item.getItemFromBlock(Blocks.red_mushroom), 3);
					this.dropItem(Item.getItemFromBlock(Blocks.red_mushroom), 3);
				} else if (i > 5) {
					this.dropItem(Wildycraft.mithrilsword, 1);
				} else {
					this.dropItem(Wildycraft.salveCrystal, 1);
				}
			}
		}
	 
	 public boolean getCanSpawnHere()
	 {
		int i = MathHelper.floor_double(this.posX);
	    int j = MathHelper.floor_double(this.boundingBox.minY);
	    int k = MathHelper.floor_double(this.posZ);
	    Block block = worldObj.getBlock((int)Math.round(this.posX),(int)(this.posY - 1),(int) Math.round(this.posZ));
	    return block != Blocks.stonebrick && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL &&
	    	this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);

	 }
	 public boolean attackEntityFrom(DamageSource par1DamageSource, float par2){
		 boolean flag = false;
		 if((par1DamageSource.getDamageType().equals("mob") || par1DamageSource.getDamageType().equals("player"))){
			 if(par1DamageSource.getEntity() instanceof EntityLivingBase){
				 EntityLivingBase eb = (EntityLivingBase) par1DamageSource.getEntity();
				 if (eb.getHeldItem() != null){
					if(eb.getHeldItem().getItem() == Wildycraft.wolfbane){
						flag = true;
					}
				 }
			 }
		 }
		 if(getType() == 0 && !flag && !this.worldObj.isRemote){
			 setType(1);
			 this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
			 this.worldObj.playSoundAtEntity(this, "mob.wolf.howl", 1, 1);
			 this.setHealth(this.getMaxHealth());
		 }
		 return super.attackEntityFrom(par1DamageSource, par2);
	 }
	 
	 public int getType(){
		 return this.dataWatcher.getWatchableObjectInt(12);
	 }
	 public void setType(int par1){
	 	this.dataWatcher.updateObject(12, par1);
	 }
	 
	 public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	    {
	        super.readEntityFromNBT(par1NBTTagCompound);

	        setType(par1NBTTagCompound.getInteger("Type"));
	    }
	 
	 public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
			par1NBTTagCompound.setInteger("Type", getType());
			super.writeEntityToNBT(par1NBTTagCompound);
		}
}
