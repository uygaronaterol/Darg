package com.puncix.darg.core.init;

import com.puncix.darg.Darg;
import com.puncix.darg.common.entity.entities.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, Darg.MOD_ID);

    //projectiles
    public static final RegistryObject<EntityType<StaffOfExheristaffProjectileEntity>> STAFF_OF_EXHERISTAFF_PROJECTILE_ENTITY =
            ENTITY_TYPES.register("staff_of_exheristaff_projectile_entity",
                    () -> EntityType.Builder.<StaffOfExheristaffProjectileEntity>create(StaffOfExheristaffProjectileEntity::new,
                            EntityClassification.MISC).size(0.2f, 0.2f)
                            .build(new ResourceLocation(Darg.MOD_ID, "staff_of_exheristaff_projectile_entity").toString()));
    public static final RegistryObject<EntityType<ExheristaffProjectileEntity>> EXHERISTAFF_PROJECTILE_ENTITY =
            ENTITY_TYPES.register("exheristaff_projectile_entity",
                    () -> EntityType.Builder.<ExheristaffProjectileEntity>create(ExheristaffProjectileEntity::new,
                            EntityClassification.MISC).size(0.4f, 0.4f)
                            .build(new ResourceLocation(Darg.MOD_ID, "exheristaff_projectile_entity").toString()));



    public static final RegistryObject<EntityType<MedusaProjectileEntity>> MEDUSA_PROJECTILE_ENTITY =
            ENTITY_TYPES.register("medusa_projectile_entity",
                    () -> EntityType.Builder.<MedusaProjectileEntity>create(MedusaProjectileEntity::new,
                            EntityClassification.MISC).size(0.4f, 0.4f)
                            .build(new ResourceLocation(Darg.MOD_ID, "medusa_projectile_entity").toString()));


    //mobs
    public static final RegistryObject<EntityType<CorruptedCowEntity>> CORRUPTED_COW =
            ENTITY_TYPES.register("corrupted_cow",
                    () -> EntityType.Builder.create(CorruptedCowEntity::new,
                            EntityClassification.CREATURE).size(0.95f, 1.3f)
                            .build(new ResourceLocation(Darg.MOD_ID, "corrupted_cow").toString()));
    public static final RegistryObject<EntityType<CorruptedPigEntity>> CORRUPTED_PIG =
            ENTITY_TYPES.register("corrupted_pig",
                    () -> EntityType.Builder.create(CorruptedPigEntity::new,
                            EntityClassification.CREATURE).size(0.8f, 1f)
                            .build(new ResourceLocation(Darg.MOD_ID, "corrupted_pig").toString()));
    public static final RegistryObject<EntityType<CorruptedChickenEntity>> CORRUPTED_CHICKEN =
            ENTITY_TYPES.register("corrupted_chicken",
                    () -> EntityType.Builder.create(CorruptedChickenEntity::new,
                            EntityClassification.CREATURE).size(0.4f, 0.7f)
                            .build(new ResourceLocation(Darg.MOD_ID, "corrupted_chicken").toString()));
    public static final RegistryObject<EntityType<CorruptedHorseEntity>> CORRUPTED_HORSE =
            ENTITY_TYPES.register("corrupted_horse",
                    () -> EntityType.Builder.create(CorruptedHorseEntity::new,
                            EntityClassification.CREATURE).size(1f, 1.6f)
                            .build(new ResourceLocation(Darg.MOD_ID, "corrupted_horse").toString()));
    public static final RegistryObject<EntityType<CorruptedSheepEntity>> CORRUPTED_SHEEP =
            ENTITY_TYPES.register("corrupted_sheep",
                    () -> EntityType.Builder.create(CorruptedSheepEntity::new,
                            EntityClassification.CREATURE).size(0.8f, 1.2f)
                            .build(new ResourceLocation(Darg.MOD_ID, "corrupted_sheep").toString()));
    public static final RegistryObject<EntityType<CorruptedDonkeyEntity>> CORRUPTED_DONKEY =
            ENTITY_TYPES.register("corrupted_donkey",
                    () -> EntityType.Builder.create(CorruptedDonkeyEntity::new,
                            EntityClassification.CREATURE).size(0.8f, 1.2f)
                            .build(new ResourceLocation(Darg.MOD_ID, "corrupted_donkey").toString()));
    public static final RegistryObject<EntityType<ExheristaffEntity>> EXHERISTAFF =
            ENTITY_TYPES.register("exheristaff",
                    () -> EntityType.Builder.create(ExheristaffEntity::new,
                            EntityClassification.CREATURE).size(1f, 3f)
                            .build(new ResourceLocation(Darg.MOD_ID, "exheristaff").toString()));
    public static final RegistryObject<EntityType<CorruptedZombieEntity>> CORRUPTED_ZOMBIE =
            ENTITY_TYPES.register("corrupted_zombie",
                    () -> EntityType.Builder.create(CorruptedZombieEntity::new,
                            EntityClassification.CREATURE).size(0.7f, 1.5f)
                            .build(new ResourceLocation(Darg.MOD_ID, "corrupted_zombie").toString()));

    public static final RegistryObject<EntityType<MoglingEntity>> MOGLING =
            ENTITY_TYPES.register("mogling",
                    () -> EntityType.Builder.create(MoglingEntity::new,
                            EntityClassification.CREATURE).size(0.5f, 0.6f)
                            .build(new ResourceLocation(Darg.MOD_ID, "mogling").toString()));
    public static final RegistryObject<EntityType<GoldLayingChickenEntity>> GOLD_LAYING_CHICKEN =
            ENTITY_TYPES.register("gold_laying_chicken",
                    () -> EntityType.Builder.create(GoldLayingChickenEntity::new,
                            EntityClassification.CREATURE).size(0.4f, 0.7f)
                            .build(new ResourceLocation(Darg.MOD_ID, "gold_laying_chicken").toString()));
    public static final RegistryObject<EntityType<ZorbigEntity>> ZORBIG =
            ENTITY_TYPES.register("zorbig",
                    () -> EntityType.Builder.create(ZorbigEntity::new,
                            EntityClassification.CREATURE).size(0.5f, 0.6f)
                            .build(new ResourceLocation(Darg.MOD_ID, "zorbig").toString()));
    public static final RegistryObject<EntityType<PaleontologistMoglingEntity>> PALEONTOLOGIST_MOGLING =
            ENTITY_TYPES.register("paleontologist_mogling",
                    () -> EntityType.Builder.create(PaleontologistMoglingEntity::new,
                            EntityClassification.CREATURE).size(0.5f, 0.6f)
                            .build(new ResourceLocation(Darg.MOD_ID, "paleontologist_mogling").toString()));
    public static final RegistryObject<EntityType<MedusaEntity>> MEDUSA =
            ENTITY_TYPES.register("medusa",
                    () -> EntityType.Builder.create(MedusaEntity::new,
                            EntityClassification.CREATURE).size(2.5f, 3f)
                            .build(new ResourceLocation(Darg.MOD_ID, "medusa").toString()));
    public static final RegistryObject<EntityType<DarbigEntity>> DARBIG =
            ENTITY_TYPES.register("darbig",
                    () -> EntityType.Builder.create(DarbigEntity::new,
                            EntityClassification.CREATURE).size(0.5f, 0.6f)
                            .build(new ResourceLocation(Darg.MOD_ID, "darbig").toString()));
    public static final RegistryObject<EntityType<MedusaSnakeEntity>> MEDUSA_SNAKE =
            ENTITY_TYPES.register("medusa_snake",
                    () -> EntityType.Builder.create(MedusaSnakeEntity::new,
                            EntityClassification.CREATURE).size(0.3f, 0.2f)
                            .build(new ResourceLocation(Darg.MOD_ID, "medusa_snake").toString()));
    public static final RegistryObject<EntityType<EaterEntity>> EATER =
            ENTITY_TYPES.register("eater",
                    () -> EntityType.Builder.create(EaterEntity::new,
                            EntityClassification.MONSTER).size(2f, 1.5f)
                            .build(new ResourceLocation(Darg.MOD_ID, "eater").toString()));
    public static final RegistryObject<EntityType<VarzakEntity>> VARZAK =
            ENTITY_TYPES.register("varzak",
                    () -> EntityType.Builder.create(VarzakEntity::new,
                            EntityClassification.CREATURE).size(0.7f, 2.2f)
                            .build(new ResourceLocation(Darg.MOD_ID, "varzak").toString()));
    public static final RegistryObject<EntityType<DwarfEntity>> DWARF =
            ENTITY_TYPES.register("dwarf",
                    () -> EntityType.Builder.create(DwarfEntity::new,
                            EntityClassification.CREATURE).size(0.8f, 1.1f)
                            .build(new ResourceLocation(Darg.MOD_ID, "dwarf").toString()));
    public static final RegistryObject<EntityType<KatsuEntity>> KATSU =
            ENTITY_TYPES.register("katsu",
                    () -> EntityType.Builder.create(KatsuEntity::new,
                            EntityClassification.CREATURE).size(0.8f, 3.1f)
                            .build(new ResourceLocation(Darg.MOD_ID, "katsu").toString()));
    public static final RegistryObject<EntityType<NinjaEntity>> NINJA =
            ENTITY_TYPES.register("ninja",
                    () -> EntityType.Builder.create(NinjaEntity::new,
                            EntityClassification.CREATURE).size(0.8f, 2.1f)
                            .build(new ResourceLocation(Darg.MOD_ID, "ninja").toString()));
    public static final RegistryObject<EntityType<WolfyreEntity>> WOLFYRE =
            ENTITY_TYPES.register("wolfyre",
                    () -> EntityType.Builder.create(WolfyreEntity::new,
                            EntityClassification.CREATURE).size(0.8f, 3.1f)
                            .build(new ResourceLocation(Darg.MOD_ID, "wolfyre").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
