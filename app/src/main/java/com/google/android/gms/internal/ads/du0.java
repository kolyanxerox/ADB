package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class du0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final du0 f18410OooO0O0 = new du0();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f18411OooO00o = new HashMap();

    public final synchronized void OooO00o(String str, yq0 yq0Var) {
        try {
            if (!this.f18411OooO00o.containsKey(str)) {
                this.f18411OooO00o.put(str, yq0Var);
                return;
            }
            if (((yq0) this.f18411OooO00o.get(str)).equals(yq0Var)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f18411OooO00o.get(str)) + "), cannot insert " + String.valueOf(yq0Var));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0O0(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            OooO00o((String) entry.getKey(), (yq0) entry.getValue());
        }
    }
}
