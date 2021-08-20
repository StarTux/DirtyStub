package com.cavetale.dirty;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.NonNull;

public final class Dirty {
    private Dirty() { }

    public static Object toTag(Object value) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Map<String, Object> getItemTag(org.bukkit.inventory.ItemStack bukkitItem) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Map<String, Object> serializeItem(org.bukkit.inventory.ItemStack bukkitItem) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static org.bukkit.inventory.ItemStack deserializeItem(Map<String, Object> json) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static org.bukkit.inventory.ItemStack deserializeItem(String json) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static org.bukkit.inventory.ItemStack setItemTag(org.bukkit.inventory.ItemStack bukkitItem, Map<String, Object> json) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Map<String, Object> getBlockTag(org.bukkit.block.Block bukkitBlock) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Map<String, Object> getBlockTag(org.bukkit.block.BlockState bukkitBlockState) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static boolean setBlockTag(org.bukkit.block.Block bukkitBlock, Map<String, Object> json) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Map<String, Object> getEntityTag(org.bukkit.entity.Entity entity) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static void setEntityTag(org.bukkit.entity.Entity entity, Map<String, Object> json) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Optional<Object> accessItemNBT(org.bukkit.inventory.ItemStack bukkitItem, boolean create) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static org.bukkit.inventory.ItemStack newCraftItemStack(org.bukkit.Material bukkitMaterial) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static org.bukkit.inventory.ItemStack toCraftItemStack(org.bukkit.inventory.ItemStack bukkitItem) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Optional<Object> setNBT(Optional<Object> opt, String key, Object value) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Optional<Object> setNBT(Optional<Object> opt, int index, Object value) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Optional<Object> addNBT(Optional<Object> opt, Object value) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Optional<Object> getNBT(Optional<Object> opt, String key) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Optional<Object> getNBT(Optional<Object> opt, int index) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static Object fromNBT(Optional<Object> opt) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static  org.bukkit.inventory.ItemStack makeSkull(@NonNull String id, @NonNull String texture) {
        throw new UnsupportedOperationException("This is a stub!");
    }

    public static List<Map<String, Object>> getStructures(org.bukkit.Chunk bukkitChunk) {
        throw new UnsupportedOperationException("This is a stub!");
    }
}
