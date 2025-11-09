package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* loaded from: classes2.dex */
public final /* synthetic */ class la1 implements zk0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ xa1 f20834OooOo0O;

    public /* synthetic */ la1(xa1 xa1Var) {
        this.f20834OooOo0O = xa1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zk0
    public final boolean zza(Object obj) {
        boolean z;
        OoooOOO.o0O0oo00 o0o0oo00;
        OoooOOO.o0O0oo00 o0o0oo002;
        xa1 xa1Var = this.f20834OooOo0O;
        o0OoOo0 o0oooo0 = (o0OoOo0) obj;
        synchronized (xa1Var.f25588OooO0OO) {
            try {
                z = true;
                if (xa1Var.f25590OooO0o.f23560OooOOOo && !xa1Var.f25591OooO0o0) {
                    int i = o0oooo0.f22236OooOoo0;
                    char c = 65535;
                    if (i != -1 && i > 2) {
                        String str = o0oooo0.f22222OooOOO0;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 187078297:
                                    if (str.equals("audio/ac4")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                            }
                            if ((c != 0 && c != 1 && c != 2 && c != 3) || (i80.f19994OooO00o >= 32 && (o0o0oo00 = xa1Var.f25592OooO0oO) != null && o0o0oo00.f14469OooOo0O)) {
                            }
                        }
                        if (i80.f19994OooO00o < 32 || (o0o0oo002 = xa1Var.f25592OooO0oO) == null || !o0o0oo002.f14469OooOo0O || !((Spatializer) o0o0oo002.f14470OooOo0o).isAvailable() || !((Spatializer) xa1Var.f25592OooO0oO.f14470OooOo0o).isEnabled() || !xa1Var.f25592OooO0oO.OooO(o0oooo0, xa1Var.f25593OooO0oo)) {
                            z = false;
                        }
                    }
                }
            } finally {
            }
        }
        return z;
    }
}
