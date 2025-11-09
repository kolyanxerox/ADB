package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.xy */
/* loaded from: classes2.dex */
public final class C2250xy implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f25816OooO00o;

    public /* synthetic */ C2250xy(int i) {
        this.f25816OooO00o = i;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f25816OooO00o) {
            case 0:
                return new d90();
            case 1:
            case 2:
            case 3:
                return null;
            case 4:
                return new c10();
            case 5:
                return new q10();
            case 6:
                return new s10();
            case 7:
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new v10(c2163vl);
            case 8:
                return new y10(11, 12, 1007);
            case 9:
                return new y10(19, 20, 1008);
            case 10:
                return new y10(13, 14, 1004);
            case 11:
                return new y10(1001, 1002, 1003);
            case 12:
                return new y10(15, 16, 1005);
            case 13:
                return new y10(17, 18, 1006);
            case 14:
                return new i20(ef0.SIGNALS, "ttc");
            case 15:
                return new i20(ef0.PRELOADED_LOADER, "t_load_as");
            case 16:
                return new e30();
            case 17:
                zzv.zzq();
                String string = UUID.randomUUID().toString();
                ii0.Oooo000(string);
                return string;
            case 18:
                return new m50();
            case 19:
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                return new u80(c2163vl2);
            case 20:
                return new e90();
            case 21:
                return new y90();
            case 22:
                C2163vl c2163vl3 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl3);
                return new na0(c2163vl3, 0);
            case 23:
                Object arrayList = new ArrayList();
                C2148v6 c2148v6 = AbstractC1448c7.o0OoooOO;
                if (!((String) zzbe.zzc().OooO00o(c2148v6)).isEmpty()) {
                    arrayList = Arrays.asList(((String) zzbe.zzc().OooO00o(c2148v6)).split(","));
                }
                ii0.Oooo000(arrayList);
                return arrayList;
            case 24:
                C2148v6 c2148v62 = AbstractC1448c7.f17710OooO00o;
                return zzbe.zza().OooO00o();
            case 25:
                C2163vl c2163vl4 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl4);
                return new na0(c2163vl4, 1);
            case 26:
                C2163vl c2163vl5 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl5);
                return new na0(c2163vl5, 2);
            case 27:
                C2163vl c2163vl6 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl6);
                return new na0(c2163vl6, 4);
            case 28:
                return new td0();
            default:
                return new sd0();
        }
    }
}
