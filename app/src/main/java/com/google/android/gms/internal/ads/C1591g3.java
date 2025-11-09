package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3126fq;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.g3 */
/* loaded from: classes2.dex */
public final class C1591g3 implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f19198OooO00o;

    public /* synthetic */ C1591g3(int i) {
        this.f19198OooO00o = i;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f19198OooO00o) {
            case 0:
                return new C1554f3();
            case 1:
                return zzv.zzp();
            case 2:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(C3126fq.f8595b);
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 3:
                String strZzd = zzbc.zzd();
                ii0.Oooo000(strZzd);
                return strZzd;
            case 4:
                return new ArrayDeque();
            case 5:
                return new o0O(28);
            case 6:
                return new C2007rd(8);
            case 7:
                return new C2007rd(12);
            case 8:
                return new o0O(27);
            case 9:
                return zzv.zzo();
            case 10:
                return new C2205wq();
            case 11:
                return EnumC2035s4.APP_OPEN;
            case 12:
                return "app_open_ad";
            case 13:
                return EnumC2035s4.BANNER;
            case 14:
                return "banner";
            case 15:
                return new C2134ut();
            case 16:
                return new C2247xv();
            case 17:
                C1509dw c1509dw = new C1509dw();
                c1509dw.f18415OooOo0O = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17807o000O000)).intValue();
                c1509dw.f18416OooOo0o = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O)).intValue();
                return c1509dw;
            case 18:
                Set set = Collections.EMPTY_SET;
                ii0.Oooo000(set);
                return set;
            case 19:
                Set set2 = Collections.EMPTY_SET;
                ii0.Oooo000(set2);
                return set2;
            case 20:
                Set set3 = Collections.EMPTY_SET;
                ii0.Oooo000(set3);
                return set3;
            case 21:
                Set set4 = Collections.EMPTY_SET;
                ii0.Oooo000(set4);
                return set4;
            case 22:
                Set set5 = Collections.EMPTY_SET;
                ii0.Oooo000(set5);
                return set5;
            case 23:
                Set set6 = Collections.EMPTY_SET;
                ii0.Oooo000(set6);
                return set6;
            case 24:
                return new C2026rw();
            case 25:
                return EnumC2035s4.INTERSTITIAL;
            case 26:
                return "interstitial";
            case 27:
                return EnumC2035s4.AD_LOADER;
            case 28:
                return IronSourceConstants.EVENTS_NATIVE;
            default:
                return null;
        }
    }

    public C1591g3(C1804lw c1804lw) {
        this.f19198OooO00o = 19;
    }

    public /* synthetic */ C1591g3(boolean z, int i) {
        this.f19198OooO00o = i;
    }
}
