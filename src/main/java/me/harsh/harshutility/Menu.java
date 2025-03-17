package me.harsh.harshutility;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract class Menu {
    final Inventory inventory;
    final Player player;
    final int size;

    public Menu(Player player, int size, String title){
        this.player = player;
        this.size = size;
        this.inventory = Bukkit.createInventory(player, size, HarshUtility.colorize(title));

    }

    public void setItem(int index, ItemStack itemStack){
        inventory.setItem(index, itemStack);
    }
    public void addItem(ItemStack itemStack){
        inventory.addItem(itemStack);
    }
    public ItemStack getItem(int index){
        return inventory.getItem(index);
    }

    public void openMenu(){
        this.player.openInventory(inventory);
        onInventoryOpen();
    }

    protected void onInventoryOpen(){
        // do something
    }

    public int getSize() {
        return size;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Player getViewer() {
        return player;
    }
}
