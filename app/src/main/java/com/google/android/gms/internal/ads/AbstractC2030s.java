package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.s */
/* loaded from: classes2.dex */
public abstract class AbstractC2030s {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final HashSet f23961OooO00o = new HashSet();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static String f23962OooO0O0 = "media3.common";

    public static synchronized void OooO00o(String str) {
        if (f23961OooO00o.add(str)) {
            f23962OooO0O0 = f23962OooO0O0 + ", " + str;
        }
    }
}
