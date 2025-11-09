package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.l1 */
/* loaded from: classes2.dex */
public final class C1773l1 extends ze0 {

    /* renamed from: OooO, reason: collision with root package name */
    public Object f20766OooO;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f20767OooO0oO = 0;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public Long f20768OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public Object f20769OooOO0;

    public /* synthetic */ C1773l1() {
        super(13);
    }

    @Override // com.google.android.gms.internal.ads.ze0
    public final HashMap OooOoOO() {
        switch (this.f20767OooO0oO) {
            case 0:
                HashMap map = new HashMap();
                map.put(0, this.f20768OooO0oo);
                map.put(1, (Long) this.f20766OooO);
                map.put(2, (Long) this.f20769OooOO0);
                return map;
            default:
                HashMap map2 = new HashMap();
                map2.put(0, this.f20768OooO0oo);
                map2.put(1, (Boolean) this.f20766OooO);
                map2.put(2, (Boolean) this.f20769OooOO0);
                return map2;
        }
    }

    public C1773l1(String str) {
        super(13);
        HashMap mapOooO0oo = ze0.OooO0oo(str);
        if (mapOooO0oo != null) {
            this.f20768OooO0oo = (Long) mapOooO0oo.get(0);
            this.f20766OooO = (Boolean) mapOooO0oo.get(1);
            this.f20769OooOO0 = (Boolean) mapOooO0oo.get(2);
        }
    }
}
