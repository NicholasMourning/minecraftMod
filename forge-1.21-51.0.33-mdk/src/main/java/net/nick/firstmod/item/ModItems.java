package net.nick.firstmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nick.firstmod.FirstMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> EOS_CRYSTAL = ITEMS.register("eoscrystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYSTALINE_SHARD = ITEMS.register("crystaline_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GAE_BULG = ITEMS.register("gae_bulg",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}