package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.r0 */
/* loaded from: classes2.dex */
public final class C1994r0 extends ze0 {

    /* renamed from: OooO, reason: collision with root package name */
    public final String f23716OooO;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public String f23717OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final long f23718OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final String f23719OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final String f23720OooOO0O;

    public C1994r0(String str) {
        super(13);
        this.f23717OooO0oO = "E";
        this.f23718OooO0oo = -1L;
        this.f23716OooO = "E";
        this.f23719OooOO0 = "E";
        this.f23720OooOO0O = "E";
        HashMap mapOooO0oo = ze0.OooO0oo(str);
        if (mapOooO0oo != null) {
            this.f23717OooO0oO = mapOooO0oo.get(0) == null ? "E" : (String) mapOooO0oo.get(0);
            this.f23718OooO0oo = mapOooO0oo.get(1) != null ? ((Long) mapOooO0oo.get(1)).longValue() : -1L;
            this.f23716OooO = mapOooO0oo.get(2) == null ? "E" : (String) mapOooO0oo.get(2);
            this.f23719OooOO0 = mapOooO0oo.get(3) == null ? "E" : (String) mapOooO0oo.get(3);
            this.f23720OooOO0O = mapOooO0oo.get(4) != null ? (String) mapOooO0oo.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.ze0
    public final HashMap OooOoOO() {
        HashMap map = new HashMap();
        map.put(0, this.f23717OooO0oO);
        map.put(4, this.f23720OooOO0O);
        map.put(3, this.f23719OooOO0);
        map.put(2, this.f23716OooO);
        map.put(1, Long.valueOf(this.f23718OooO0oo));
        return map;
    }
}
