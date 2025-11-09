package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.C3034d9;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class iq0 {

    /* renamed from: OooO0o */
    public static final /* synthetic */ int f20086OooO0o = 0;

    /* renamed from: OooO00o */
    public final Uri f20087OooO00o;

    /* renamed from: OooO0O0 */
    public final Map f20088OooO0O0;

    /* renamed from: OooO0OO */
    public final long f20089OooO0OO;

    /* renamed from: OooO0Oo */
    public final long f20090OooO0Oo;

    /* renamed from: OooO0o0 */
    public final int f20091OooO0o0;

    static {
        AbstractC2030s.OooO00o("media3.datasource");
    }

    public iq0(Uri uri, long j, long j2) {
        this(uri, Collections.EMPTY_MAP, j, j2, 0);
    }

    public final String toString() {
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("DataSpec[GET ", this.f20087OooO00o.toString(), ", ");
        sbOooOoO0.append(this.f20089OooO0OO);
        sbOooOoO0.append(", ");
        sbOooOoO0.append(this.f20090OooO0Oo);
        sbOooOoO0.append(", null, ");
        return OooO0oO.OooOo.OooOOO(sbOooOoO0, this.f20091OooO0o0, C3034d9.i.f8179e);
    }

    public iq0(Uri uri, Map map, long j, long j2, int i) {
        boolean z = false;
        boolean z2 = j >= 0;
        af0.OoooO0(z2);
        af0.OoooO0(z2);
        if (j2 > 0) {
            z = true;
        } else if (j2 == -1) {
            j2 = -1;
            z = true;
        }
        af0.OoooO0(z);
        uri.getClass();
        this.f20087OooO00o = uri;
        this.f20088OooO0O0 = Collections.unmodifiableMap(new HashMap(map));
        this.f20089OooO0OO = j;
        this.f20090OooO0Oo = j2;
        this.f20091OooO0o0 = i;
    }
}
