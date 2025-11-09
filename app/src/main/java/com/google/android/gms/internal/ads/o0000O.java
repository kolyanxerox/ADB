package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class o0000O {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f21654OooO0OO = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f21655OooO00o = -1;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f21656OooO0O0 = -1;

    public final void OooO00o(C2107u2 c2107u2) {
        for (int i = 0; i < c2107u2.OooO00o(); i++) {
            InterfaceC1774l2 interfaceC1774l2OooO0O0 = c2107u2.OooO0O0(i);
            if (interfaceC1774l2OooO0O0 instanceof o0o0Oo) {
                o0o0Oo o0o0oo = (o0o0Oo) interfaceC1774l2OooO0O0;
                if ("iTunSMPB".equals(o0o0oo.zzb) && OooO0O0(o0o0oo.zzc)) {
                    return;
                }
            } else if (interfaceC1774l2OooO0O0 instanceof o0O00o0) {
                o0O00o0 o0o00o0 = (o0O00o0) interfaceC1774l2OooO0O0;
                if ("com.apple.iTunes".equals(o0o00o0.zza) && "iTunSMPB".equals(o0o00o0.zzb) && OooO0O0(o0o00o0.zzc)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    public final boolean OooO0O0(String str) throws NumberFormatException {
        Matcher matcher = f21654OooO0OO.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = i80.f19994OooO00o;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f21655OooO00o = i2;
            this.f21656OooO0O0 = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
