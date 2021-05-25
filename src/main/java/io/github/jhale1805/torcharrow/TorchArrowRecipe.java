package io.github.jhale1805.torcharrow;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice.MaterialChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;

public class TorchArrowRecipe extends ShapedRecipe {

    public static final String NAMESPACED_KEY = "torch_arrow";
    
    /**
     * The recipe for crafting torch arrows.
     * 
     * This recipe yields 4 torch arrows, enough to generate the same number
     * of torches that the single piece of coal could be used to craft.
     * 
     * -------------
     * |   | A |   |
     * -------------
     * | A | C | A |
     * -------------
     * |   | A |   |
     * -------------
     * 
     * @param plugin The Torch Arrow plugin. Required for associating this
     *          recipe with the plugin.
     */
    public TorchArrowRecipe(Plugin plugin) {
        super(new NamespacedKey(plugin, NAMESPACED_KEY), new TorchArrowStack());
        shape(" A ", "ACA", " A ");
        setIngredient('C', new MaterialChoice(Tag.ITEMS_COALS));
        setIngredient('A', Material.ARROW);
    }

    @Override
    public ItemStack getResult() {
        return new TorchArrowStack(4);
    }

}
