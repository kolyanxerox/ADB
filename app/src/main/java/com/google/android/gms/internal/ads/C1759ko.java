package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ko */
/* loaded from: classes2.dex */
public final class C1759ko {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final C1759ko f20636OooO0o0 = new C1759ko(-1, -1, -1);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f20637OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f20638OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f20639OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f20640OooO0Oo;

    public C1759ko(int i, int i2, int i3) {
        this.f20637OooO00o = i;
        this.f20638OooO0O0 = i2;
        this.f20639OooO0OO = i3;
        this.f20640OooO0Oo = i80.OooO0OO(i3) ? i80.OooOOO(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1759ko)) {
            return false;
        }
        C1759ko c1759ko = (C1759ko) obj;
        return this.f20637OooO00o == c1759ko.f20637OooO00o && this.f20638OooO0O0 == c1759ko.f20638OooO0O0 && this.f20639OooO0OO == c1759ko.f20639OooO0OO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20637OooO00o), Integer.valueOf(this.f20638OooO0O0), Integer.valueOf(this.f20639OooO0OO)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f20637OooO00o);
        sb.append(", channelCount=");
        sb.append(this.f20638OooO0O0);
        sb.append(", encoding=");
        return OooO0oO.OooOo.OooOOO(sb, this.f20639OooO0OO, C3034d9.i.f8179e);
    }
}
