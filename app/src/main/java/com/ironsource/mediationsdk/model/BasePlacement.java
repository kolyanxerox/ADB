package com.ironsource.mediationsdk.model;

import com.ironsource.C3463nq;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public abstract class BasePlacement {

    /* renamed from: a */
    private final int f9928a;

    /* renamed from: b */
    private final String f9929b;

    /* renamed from: c */
    private final boolean f9930c;

    /* renamed from: d */
    private final C3463nq f9931d;

    public BasePlacement(int i, String placementName, boolean z, C3463nq c3463nq) {
        OooOo.OooO0o0(placementName, "placementName");
        this.f9928a = i;
        this.f9929b = placementName;
        this.f9930c = z;
        this.f9931d = c3463nq;
    }

    public final C3463nq getPlacementAvailabilitySettings() {
        return this.f9931d;
    }

    public final int getPlacementId() {
        return this.f9928a;
    }

    public final String getPlacementName() {
        return this.f9929b;
    }

    public final boolean isDefault() {
        return this.f9930c;
    }

    public final boolean isPlacementId(int i) {
        return this.f9928a == i;
    }

    public String toString() {
        return "placement name: " + this.f9929b;
    }

    public /* synthetic */ BasePlacement(int i, String str, boolean z, C3463nq c3463nq, int i2, OooOO0O oooOO0O) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c3463nq);
    }
}
