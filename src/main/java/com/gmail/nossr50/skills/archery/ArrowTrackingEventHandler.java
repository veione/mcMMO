package com.gmail.nossr50.skills.archery;

import org.bukkit.entity.LivingEntity;

import com.gmail.nossr50.skills.utilities.SkillTools;

public class ArrowTrackingEventHandler {
    private ArcheryManager manager;
    private LivingEntity entity;

    protected int skillModifier;

    protected ArrowTrackingEventHandler (ArcheryManager manager, LivingEntity entity) {
        this.manager = manager;
        this.entity = entity;

        calculateSkillModifier();
    }

    protected void calculateSkillModifier() {
        this.skillModifier = SkillTools.skillCheck(manager.getSkillLevel(), Archery.retrieveMaxBonusLevel);
    }

    protected void addToTracker() {
        Archery.incrementTrackerValue(entity);
    }
}
