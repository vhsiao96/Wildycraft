package wildycraft.entity;

import java.util.Iterator;
import java.util.List;

import wildycraft.Wildycraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.ForgeModContainer;

public class EntityBanshee extends EntityMob{
	
	private EntityAIAttackOnCollide attackAI = new EntityAIAttackOnCollide(this, EntityLivingBase.class, 1.0D, false);
	
	private int jumpTicks = 0;
	
	private boolean persistenceRequired = false;
	
	 public EntityBanshee(World par1World){
	     super(par1World);
	     this.tasks.addTask(0, new EntityAISwimming(this));
	     this.tasks.addTask(2, attackAI);
	     this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	     this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	     this.tasks.addTask(8, new EntityAILookIdle(this));
	     this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
	     this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	     this.setSize(0.6F, 1.8F);
	     setHealDelay(0);
	 }
	 
	 public EnumCreatureAttribute getCreatureAttribute() {
			return EnumCreatureAttribute.UNDEAD;
		 }
	 
	 protected void entityInit()
     {
             super.entityInit();
             this.dataWatcher.addObject(12, Integer.valueOf(0));
     }
	 
	 protected void applyEntityAttributes(){
	     super.applyEntityAttributes();
	     this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
	     this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(90.0D);
	     this.getCreatureAttribute();
	 }
	 protected boolean isAIEnabled()
	    {
	        return true;
	    }
	 
	 public void onLivingUpdate()
	 {
		 if(getHealDelay() > 0){
			 setHealDelay(getHealDelay()-1);
		 } else {
			 setHealDelay(10);
			 this.heal(1);
		 }
		
		 List attackRange = this.worldObj.getEntitiesWithinAABBExcludingEntity(
					this, this.boundingBox.expand(6.0D, 2.0D, 6.0D));

		for (int i = 0; i < attackRange.size(); ++i) {
			Entity var6 = (Entity) attackRange.get(i);
			
			if (this.worldObj.isRemote && var6 instanceof EntityPlayerSP) {
				if (!(((EntityPlayerSP) var6).getEquipmentInSlot(4) != null
						&& ((EntityPlayerSP) var6).getEquipmentInSlot(4).getItem() == Wildycraft.earmuffs)) {
					if(!((EntityPlayerSP) var6).capabilities.isCreativeMode){
						var6.playSound("mob.ghast.scream", 1, 1);
					}
				}
			}

			if (!this.worldObj.isRemote && var6 instanceof EntityLivingBase) {
				if (((EntityLivingBase) var6).getCreatureAttribute() != EnumCreatureAttribute.UNDEAD && !Wildycraft.isLivingMorytaniaMob(var6)) {
					if (!(((EntityLivingBase) var6).getEquipmentInSlot(4) != null
							&& ((EntityLivingBase) var6).getEquipmentInSlot(4).getItem() == Wildycraft.earmuffs)) {
						DamageSource ds = new EntityDamageSourceIndirect(
								"Banshee Shriek", this, var6) {
							public IChatComponent func_151519_b(
									EntityLivingBase par1EntityLivingBase) {
								String s = par1EntityLivingBase
										.getCommandSenderName();
								s += " couldn't take it anymore";
								return new ChatComponentText(s);
							}
						}.setMagicDamage();
						if (var6.attackEntityFrom(ds, 1)) {
							((EntityLivingBase) var6).addPotionEffect(new PotionEffect(2, 200, 2));
							((EntityLivingBase) var6).addPotionEffect(new PotionEffect(4, 200, 2));
							((EntityLivingBase) var6).addPotionEffect(new PotionEffect(9, 400, 2));
							if (((EntityLivingBase) var6).getActivePotionEffect(Potion.weakness) != null) {
								int current = ((EntityLivingBase) var6).getActivePotionEffect(Potion.weakness).getAmplifier();
								if (current < 50) {
									((EntityLivingBase) var6).addPotionEffect(new PotionEffect(18, 200, current + 1));
								}
							} else {
								((EntityLivingBase) var6).addPotionEffect(new PotionEffect(18,200, 0));
							}
						}
					}
				}
			}
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
			if (k > 998) {
				this.dropItem(Wildycraft.blueCharm, 1);
			} else if (k > 991) {
				this.dropItem(Wildycraft.greenCharm, 1);
			} else if (k > 791) {
				this.dropItem(Wildycraft.goldCharm, 1);
			} else if (k > 781) {
				this.dropItem(Wildycraft.crimsonCharm, 1);
			} 
			for (var4 = 0; var4 < var3; ++var4) {
				double i = rand.nextInt(100);
				if (i > 70) {
					this.dropItem(Item.getItemFromBlock(Blocks.stone), rand.nextInt(24) + 4);
				} else if (i > 60){
					this.dropItem(Wildycraft.airRune,3);
				}else if (i > 45){
					this.dropItem(Item.getItemFromBlock(Blocks.iron_ore),1);
				}else if (i > 37){
					this.dropItem(Wildycraft.cosmicRune,1);
				}else if (i > 29){
					this.dropItem(Wildycraft.fireRune,2);
				}else if (i > 8){
					this.dropItem(Items.experience_bottle,3);
				}else {
					this.dropItem(Wildycraft.darkMysticGloves,1);
				}
			}
		}
	 
	 public boolean getCanSpawnHere()
	 {
		int i = MathHelper.floor_double(this.posX);
	    int j = MathHelper.floor_double(this.boundingBox.minY);
	    int k = MathHelper.floor_double(this.posZ);
	    return this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL &&
	    	this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);

	 }
	 
	 public int getHealDelay(){
		 return this.dataWatcher.getWatchableObjectInt(12);
	 }
	 public void setHealDelay(int par1){
	 	this.dataWatcher.updateObject(12, par1);
	 }
}
