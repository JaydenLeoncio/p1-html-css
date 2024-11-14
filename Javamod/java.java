@Mod("jujutsukaisenmod")
public class JujutsuKaisenMod {
    public static final String MOD_ID = "jujutsukaisenmod";

    public JujutsuKaisenMod() {
        // Code om items, entiteiten, en vaardigheden te registreren
    }
}
public class CursedDagger extends SwordItem {
    public CursedDagger() {
        super(Tiers.DIAMOND, 3, -2.4F, new Item.Properties().tab(CreativeModeTabs.TAB_COMBAT));
    }
}
public class CursedEnergyAbility {
    public static void activate(Level world, Player player) {
        List<LivingEntity> entities = world.getEntitiesOfClass(LivingEntity.class, player.getBoundingBox().inflate(5));
        for (LivingEntity entity : entities) {
            if (entity != player) {
                entity.hurt(DamageSource.MAGIC, 10.0F); // 10 punten schade
                // Voeg speciale effecten toe, zoals particles
            }
        }
    }
}
public class CursedSpirit extends Monster {
    public CursedSpirit(EntityType<? extends Monster> type, Level world) {
        super(type, world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, true));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }
}
public class DomainExpansion {
    public static void activate(Player player) {
        // Maak een domein met aangepaste regels en beperkingen
        // Effecten zoals hogere schade, langzamere tijd, enz.
    }
}
