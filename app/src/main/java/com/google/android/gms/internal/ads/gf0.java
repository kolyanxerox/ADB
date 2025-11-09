package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class gf0 {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final yp0 f19331OooO0Oo = yp0.f25991OooOo0o;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2163vl f19332OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f19333OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ff0 f19334OooO0OO;

    public gf0(C2163vl c2163vl, ScheduledExecutorService scheduledExecutorService, ff0 ff0Var) {
        this.f19332OooO00o = c2163vl;
        this.f19333OooO0O0 = scheduledExecutorService;
        this.f19334OooO0OO = ff0Var;
    }

    public final s20 OooO00o(Object obj, o00000oO.OooOOO oooOOO) {
        return new s20(this, obj, null, oooOOO, Collections.singletonList(oooOOO), oooOOO);
    }
}
