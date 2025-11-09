package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdy;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class ug0 implements Predicate {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24647OooO00o;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f24647OooO00o) {
            case 0:
                return BinderC1913ou.class.isInstance((zzdy) obj);
            default:
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                return !str.trim().isEmpty();
        }
    }
}
