package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s31 extends o31 {

    /* renamed from: OooO0O0 */
    public static final /* synthetic */ int f23985OooO0O0 = 0;

    static {
        r31.OooO00o(Collections.EMPTY_MAP);
    }

    public static pd0 OooO00o(int i) {
        return new pd0(i);
    }

    @Override // com.google.android.gms.internal.ads.z31
    /* renamed from: OooO0O0 */
    public final Map zzb() {
        Map map = this.f22327OooO00o;
        LinkedHashMap linkedHashMapOooo0O0 = xh0.Oooo0O0(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapOooo0O0.put(entry.getKey(), ((v31) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapOooo0O0);
    }
}
