package com.applovin.mediation.nativeAds.adPlacer;

import OooO0oO.OooOo;
import com.applovin.impl.sdk.C1240o;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a */
    private final String f3323a;

    /* renamed from: b */
    private String f3324b;

    /* renamed from: c */
    private final Set f3325c = new TreeSet();

    /* renamed from: d */
    private int f3326d = 0;

    /* renamed from: e */
    private int f3327e = 256;

    /* renamed from: f */
    private int f3328f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f3323a = str;
    }

    public void addFixedPosition(int i) {
        this.f3325c.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f3323a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f3325c;
    }

    public int getMaxAdCount() {
        return this.f3327e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f3328f;
    }

    public String getPlacement() {
        return this.f3324b;
    }

    public int getRepeatingInterval() {
        return this.f3326d;
    }

    public boolean hasValidPositioning() {
        return !this.f3325c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f3326d >= 2;
    }

    public void resetFixedPositions() {
        this.f3325c.clear();
    }

    public void setMaxAdCount(int i) {
        this.f3327e = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f3328f = i;
    }

    public void setPlacement(String str) {
        this.f3324b = str;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.f3326d = i;
            C1240o.m3206g("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.f3326d = 0;
        C1240o.m3209j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdPlacerSettings{adUnitId='");
        sb.append(this.f3323a);
        sb.append("', fixedPositions=");
        sb.append(this.f3325c);
        sb.append(", repeatingInterval=");
        sb.append(this.f3326d);
        sb.append(", maxAdCount=");
        sb.append(this.f3327e);
        sb.append(", maxPreloadedAdCount=");
        return OooOo.OooOOO0(sb, this.f3328f, '}');
    }
}
