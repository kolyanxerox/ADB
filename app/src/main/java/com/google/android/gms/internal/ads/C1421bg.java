package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.bg */
/* loaded from: classes2.dex */
public final class C1421bg {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f17492OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f17493OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f17494OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OoOo0[] f17495OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f17496OooO0o0;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C1421bg(String str, o0OoOo0... o0oooo0Arr) {
        int length = o0oooo0Arr.length;
        int i = 1;
        af0.OoooO0(length > 0);
        this.f17493OooO0O0 = str;
        this.f17495OooO0Oo = o0oooo0Arr;
        this.f17492OooO00o = length;
        int iOooO0O0 = AbstractC1813m4.OooO0O0(o0oooo0Arr[0].f22222OooOOO0);
        this.f17494OooO0OO = iOooO0O0 == -1 ? AbstractC1813m4.OooO0O0(o0oooo0Arr[0].OooOO0o) : iOooO0O0;
        String str2 = o0oooo0Arr[0].f22214OooO0Oo;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = o0oooo0Arr[0].f22215OooO0o | 16384;
        while (true) {
            o0OoOo0[] o0oooo0Arr2 = this.f17495OooO0Oo;
            if (i >= o0oooo0Arr2.length) {
                return;
            }
            String str3 = o0oooo0Arr2[i].f22214OooO0Oo;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                o0OoOo0[] o0oooo0Arr3 = this.f17495OooO0Oo;
                OooO00o("languages", o0oooo0Arr3[0].f22214OooO0Oo, o0oooo0Arr3[i].f22214OooO0Oo, i);
                return;
            } else {
                o0OoOo0[] o0oooo0Arr4 = this.f17495OooO0Oo;
                if (i2 != (o0oooo0Arr4[i].f22215OooO0o | 16384)) {
                    OooO00o("role flags", Integer.toBinaryString(o0oooo0Arr4[0].f22215OooO0o), Integer.toBinaryString(this.f17495OooO0Oo[i].f22215OooO0o), i);
                    return;
                }
                i++;
            }
        }
    }

    public static void OooO00o(String str, String str2, String str3, int i) {
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbOooOOo0.append(str3);
        sbOooOOo0.append("' (track ");
        sbOooOOo0.append(i);
        sbOooOOo0.append(")");
        AbstractC1641hg.OooOOO0("TrackGroup", "", new IllegalStateException(sbOooOOo0.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1421bg.class == obj.getClass()) {
            C1421bg c1421bg = (C1421bg) obj;
            if (this.f17493OooO0O0.equals(c1421bg.f17493OooO0O0) && Arrays.equals(this.f17495OooO0Oo, c1421bg.f17495OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17496OooO0o0;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f17495OooO0Oo) + ((this.f17493OooO0O0.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        this.f17496OooO0o0 = iHashCode;
        return iHashCode;
    }
}
