package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tb */
/* loaded from: classes2.dex */
public final class C2079tb implements InterfaceC2042sb {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24291OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final p30 f24292OooOo0o;

    public C2079tb(p30 p30Var, int i) {
        this.f24291OooOo0O = i;
        switch (i) {
            case 1:
                Oooo00O.o000000O.OooO(p30Var, "The Inspector Manager must not be null");
                this.f24292OooOo0o = p30Var;
                break;
            default:
                Oooo00O.o000000O.OooO(p30Var, "The Inspector Manager must not be null");
                this.f24292OooOo0o = p30Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    public final void OooO0o0(Object obj, Map map) throws NumberFormatException {
        switch (this.f24291OooOo0O) {
            case 0:
                if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    return;
                }
                p30 p30Var = this.f24292OooOo0o;
                String str = (String) map.get("persistentData");
                synchronized (p30Var) {
                    p30Var.f23207OooOo = str;
                    zzv.zzp().OooO0Oo().zzC(p30Var.f23207OooOo);
                }
                return;
            default:
                if (map == null || !map.containsKey("extras")) {
                    return;
                }
                boolean zContainsKey = map.containsKey("expires");
                long j = LocationRequestCompat.PASSIVE_INTERVAL;
                if (zContainsKey) {
                    try {
                        j = Long.parseLong((String) map.get("expires"));
                    } catch (NumberFormatException unused) {
                    }
                }
                p30 p30Var2 = this.f24292OooOo0o;
                String str2 = (String) map.get("extras");
                synchronized (p30Var2) {
                    p30Var2.f23202OooOOOO = str2;
                    p30Var2.f23205OooOOo0 = j;
                    p30Var2.OooO();
                }
                return;
        }
    }
}
