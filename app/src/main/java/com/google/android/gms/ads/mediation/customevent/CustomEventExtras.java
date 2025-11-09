package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

@Deprecated
/* loaded from: classes2.dex */
public final class CustomEventExtras {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f16440OooO00o = new HashMap();

    @Nullable
    public Object getExtra(@NonNull String str) {
        return this.f16440OooO00o.get(str);
    }

    public void setExtra(@NonNull String str, @NonNull Object obj) {
        this.f16440OooO00o.put(str, obj);
    }
}
