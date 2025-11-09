package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.y7 */
/* loaded from: classes2.dex */
public final class C2260y7 {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final C2260y7 f25859OooO0Oo = new C2260y7(1.0f, 1.0f);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final float f25860OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final float f25861OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f25862OooO0OO;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C2260y7(float f, float f2) {
        af0.OoooO0(f > 0.0f);
        af0.OoooO0(f2 > 0.0f);
        this.f25860OooO00o = f;
        this.f25861OooO0O0 = f2;
        this.f25862OooO0OO = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2260y7.class == obj.getClass()) {
            C2260y7 c2260y7 = (C2260y7) obj;
            if (this.f25860OooO00o == c2260y7.f25860OooO00o && this.f25861OooO0O0 == c2260y7.f25861OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f25861OooO0O0) + ((Float.floatToRawIntBits(this.f25860OooO00o) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f25860OooO00o), Float.valueOf(this.f25861OooO0O0));
    }
}
